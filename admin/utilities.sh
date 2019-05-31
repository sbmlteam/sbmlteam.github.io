## ============================================================================
## File name   : utilities.sh
## Description : Utilities used by server.sh
## Author(s)   : Michael Hucka <mhucka@caltech.edu>
## Organization: California Institute of Technology
## Date created: 2019-05-31
## ============================================================================

check_log_file() {
    set_ifs

    if [[ -n $HUGO_LOGFILE ]]; then
        if [[ -e "$HUGO_LOGFILE" && ! -w "$HUGO_LOGFILE" ]]; then
            printf '%s\n' "Unable to write log file $HUGO_LOGFILE."
            exit 1
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
