## ============================================================================
## File name   : utilities.sh
## Description : Utilities used by server-control
## Author(s)   : Michael Hucka <mhucka@caltech.edu>
## Organization: California Institute of Technology
## Date created: 2019-05-31
## ============================================================================

# This definition is used in a pipe command in the main section.
# Do NOT merge this with the next function definition for log().
LOG="logger -t $PROCESS_OWNER -p daemon.info"

log() {
    $LOG $* >&2
}

check_log_file() {
    file=$1
    if [ -n "$file" ]; then
        # We have a value for the configuration variable.  Does the file exist?
        if [ ! -e "$file" ]; then
            # The file doesn't exist.  Is it because the dir doesn't exist?
            dir=$(dirname "$file")
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
        elif [ ! -w "$file" ]; then
            echo "Unable to write log file $file." >&2
            exit 2
        fi
    fi
}

set_ifs() {
    IFS=$'\n'
}

restore_ifs() {
    IFS=$' \t\n'
}
