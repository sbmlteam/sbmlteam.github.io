## ============================================================================
## File name   : utilities.sh
## Description : Utilities used by server.sh
## Author(s)   : Michael Hucka <mhucka@caltech.edu>
## Organization: California Institute of Technology
## Date created: 2019-05-31
## ============================================================================

check_log_file() {
    set_ifs

    if [ -n $HUGO_LOGFILE ]; then
        # We have a value for the configuration variable.  Does the file exist?
        if [ ! -e "$HUGO_LOGFILE" ]; then
            # The file doesn't exist.  Is it because the dir doesn't exist?
            dir=$(dirname "$HUGO_LOGFILE")
            if [ ! -d "$dir" ]; then
                # Try to create the directory.
                mkdir "$dir"
                if [ ! -d "$dir" ]; then
                    echo "Unable to create $dir" >&2
                    exit 2
                fi
            fi
            if [ ! -w "$dir" ]; then
                echo "Unable to write to directory $dir" >&2
                exit 2
            fi
        elif [ ! -w "$HUGO_LOGFILE" ]; then
            echo "Unable to write log file $HUGO_LOGFILE." >&2
            exit 2
        fi
    fi

    restore_ifs
}

set_ifs() {
    IFS=$'\n'
}

restore_ifs() {
    IFS=$' \t\n'
}
