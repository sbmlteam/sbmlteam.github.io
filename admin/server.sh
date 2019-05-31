#! /bin/bash
## ============================================================================
## File name   : server.sh
## Description : Simple script to start/stop/restart a Hugo-based server
## Author(s)   : Michael Hucka <mhucka@caltech.edu>
## Organization: California Institute of Technology
## Date created: 2019-03-19
##
## Note: we don't run Hugo as root. To have Hugo bind to port 80 as a non-root
## user, it's necessary to use setcap on the hugo binary (our approach) or
## create a redirection via iptables.  However, that means the hugo binary can't
## write to /var/log and /var/run unless separate subdirectories are precreated.
## In addition, if you run hugo as non-root and you have it write to ../site,
## it needs to have permissions to this directory, so make sure to chown and
## chgrp this entire repository clone on your destination system.
##
## Here's the complete sequence I used on a CentOS 7.6 system, assuming that
## the name of the hugo account is "hugo".
##
##  sudo useradd -M hugo
##  sudo chown -R hugo.hugo ..
##  sudo setcap 'cap_net_bind_service=+ep' /usr/local/bin/hugo
##  sudo mkdir /var/log/hugo /var/run/hugo
##  sudo chown hugo /var/log/hugo /var/run/hugo
##  sudo chgrp hugo /var/log/hugo /var/run/hugo
##
## ============================================================================

# Make sure we're NOT running as root.

if (( EUID == 0 )); then
   echo "This script must not be run as root."
   exit 1
fi

# Get our configuration variables and utilities.

source config.cfg
source utilities.sh

# .............................................................................
# The rest below is generic and probably does not need to be changed.

case "$1" in
    start)
        check_log_file

        cd "$SITE_ROOT"
        if [ -z $SITE_URL ]; then
            $HUGO server > $HUGO_LOGFILE 2>&1 &
        else
            $HUGO server --bind=$SITE_IP --baseURL=$SITE_URL --port $SITE_PORT > $HUGO_LOGFILE 2>&1 &
        fi
        RETVAL=$?
        PID=`echo $!`
        if [ -z $PID ]; then
            echo "Unable to start hugo process." >&2
        else
            echo $PID > $HUGO_PIDFILE
            echo "Server started successfully with PID $PID." >&2
        fi
        echo "Log file is $HUGO_LOGFILE" >&2
        exit $RETVAL
        ;;

    stop)
        if [ ! -e $HUGO_PIDFILE ]; then
            echo "PID file $HUGO_PIDFILE does not exist." >&2
            exit 2
        fi
        PID=`cat $HUGO_PIDFILE`
        if ! kill -TERM  $PID> /dev/null 2>&1 ; then
            # We don't want to start killing processes by name, because the
            # user might have more than one server running.  Just give up.
            if ps -p $PID > /dev/null 2>&1 ; then
                echo "Could not terminate process $PID." >&2
                exit 1
            else
                echo "Process $PID no longer exists." >&2
                exit 1
            fi
        else
            echo "Process $PID killed." >&2
            exit 0
        fi
        ;;

    restart)
        $0 stop
        echo "Pausing for 2 s." >&2
        sleep 2
        echo "Restarting server." >&2
        $0 start
        exit $?
        ;;

    status)
        if [ ! -e $HUGO_PIDFILE ]; then
            echo "PID file $HUGO_PIDFILE does not exist." >&2
            exit 2
        fi
        PID=`cat $HUGO_PIDFILE`
        if ps -p $PID > /dev/null 2>&1 ; then
            echo "Hugo process $PID running." >&2
            exit 0
        else
            echo "Process $PID no longer exists." >&2
            exit 1
        fi
        ;;
    *)
        echo "Usage: $0 {start|stop|restart|status}." >&2
        exit 3
        ;;
esac
