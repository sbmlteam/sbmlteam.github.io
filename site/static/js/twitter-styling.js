// ============================================================================
// File name   : /static/js/twitter-styling.js
// Description : Dynamically change style of Twitter timeline widget on /news
// Author(s)   : Michael Hucka <mhucka@caltech.edu>
// Organization: California Institute of Technology
// Date created: 2019-11-06
//
// This file is loaded by the /news page.  This references a CSS file in
// /static/css/, and relies on the way that the Hugo Academic theme toggles
// between "dark" mode and regular mode.
//
// The idea of adding a link to a style sheet to the <head> element of the
// <iframe>, and doing it inside an interval timer, is due to user "a gorsky"
// on this Stack Overflow answer: https://stackoverflow.com/a/26633413/743730
// The basic idea is to wait a while for the iframe to load its content, and
// then try to append to the <head> element, taking care to check whether it's
// been applied and whether this has been tried a maximum number of times.
// ============================================================================

var cssURL = '/css/twitter-styling.css'
var checks = 0;
var maxChecks  = 20;
var $iframeHead;

var twitterStylesTimer = window.setInterval(function() {
    // #twitter-widget-0 is added by the Twitter widget; it is not part of our
    // code or site template anywhere.
    $iframeHead = $("iframe#twitter-widget-0").contents().find('head');

    if ( !$('#twitter-widget-styles', $iframeHead).length ) {
        // If the Twitter element is not present, add our stylesheet.
        // Note the use of an id on <link>; it must be present in the <link>
        // element below, so that it can be tested in the conditional.
        $iframeHead.append('<link id="twitter-widget-styles" type="text/css"'
                           + ' rel="stylesheet" href="' + cssURL + '">' );
    } else if ( $('#twitter-widget-styles', $iframeHead).length || ++checks > maxChecks) {
        // If stylesheet exists, or we've been trying for too long, quit.
        clearInterval(twitterStylesTimer);
    }
}, 200);
