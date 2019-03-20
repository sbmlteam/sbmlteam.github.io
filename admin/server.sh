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
## Here's the sequence I used on an CentOS 7.6 system:
##
##  setcap 'cap_net_bind_service=+ep' /usr/local/bin/hugo
##  useradd -M hugo
##  sudo mkdir /var/log/hugo /var/run/hugo
##  sudo chown hugo /var/log/hugo /var/run/hugo
##  sudo chgrp hugo /var/log/hugo /var/run/hugo
## ============================================================================

# Make sure we're NOT running as root.

if (( EUID != 0 )); then
   echo "This script must not be run as root."
   exit 1
fi

# Get our configuration variables.

source config.cfg

# .............................................................................
# The rest below is generic and probably does not need to be changed.

RETVAL=0

case "$1" in
    start)
        cd "$SITE_ROOT"
        $HUGO server --bind=$SITE_IP --baseURL=$SITE_URL --port $SITE_PORT > $HUGO_LOGFILE 2>&1 &
        RETVAL=$?
        PID=`echo $!`
        echo "PID=$PID"
        if [ -z $PID ]; then
            printf "%s\n" "Unable to start process"
        else
            echo $PID > $HUGO_PIDFILE
            printf "server started successfully with PID $PID\n"
        fi
        ;;
    stop)
        PID=`cat $HUGO_PIDFILE`
        if ! kill -TERM  $PID> /dev/null 2>&1 ; then
            # We don't want to start killing processes by name, because the
            # user might have more than one server running.  Just give up.
            if [ -n `ps -p$PID -o pid=` ]; then
                echo "Could not terminate process $PID" >&2
            else
                echo "Process $PID no longer exists" >&2
            fi
        fi
        RETVAL=$?
        ;;
    restart)
        $0 stop
        sleep 2
        $0 start
        RETVAL=$?
        ;;
    *)
        echo "Usage: $0 {start|stop|restart}" >&2
        exit 3
        ;;
esac

exit $RETVAL
