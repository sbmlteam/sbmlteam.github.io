#! /bin/bash
## ============================================================================
## File name   : server.sh
## Description : Simple script to start/stop/restart a Hugo-based server
## Author(s)   : Michael Hucka <mhucka@caltech.edu>
## Organization: California Institute of Technology
## Date created: 2019-03-19
## ============================================================================

source config.cfg

# .............................................................................
# The rest below is generic and probably does not need to be changed.

RETVAL=0

case "$1" in
    start)
        cd "$HUGO_ROOT"
        hugo server --bind=$SITE_IP --baseURL=$SITE_URL --port $SITE_PORT > $HUGO_LOGFILE 2>&1 &
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
