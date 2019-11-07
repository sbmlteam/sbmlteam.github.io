+++ # -*- mode: markdown -*-
#=====================================================================
# File:    news/_index.md
# Summary: This file defines the content of the /news page.
# ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~ ~
title = "News"
widget = ""
#=====================================================================
+++

Here you will find news about the SBML project (including new developments in SBML and upcoming events such as Forum Meetings), as well as broader news of the SBML-using community.

<!-- Note to site maintainers: the content of this page consists of
     2 columns.

     The left column is auto-filled from the content of the files
     located in this directory (/content/news/).  The template that
     defines the content of this page is layouts/_default/list.html.

     The right-hand column is filled in by the Twitter widget below.

     The styling inside the Twitter timeline is adjusted by JavaScript
     code in twitter-styling.js; this is necessary because (1) some
     Twitter style properties such as color can't be adjusted using CSS
     in this page (because the Twitter widget creates an iframe, and 
     parent CSS can't affect the contents of an iframe), and (2) passing
     the flag to turn on Twitter's dark mode theme is impossible to do
     any other way -- the dark mode toggle in Hugo Academic is done
     purely in JavaScript, in the rendered page, so Hugo templates and
     variables can't change it.
-->

<div class="col-6 twitter-box-outer">
  <div class="twitter-box-inner">
    <script async src="https://platform.twitter.com/widgets.js" charset="utf-8"></script>
    <p class="twitter-box-heading">Recent tweets by <a href="https://twitter.com/sbmlnews">@sbmlnews</a>:</p>
    <!-- For more information about parameters to the Twitter feed, see
         https://developer.twitter.com/en/docs/twitter-for-websites/timelines/overview -->
    <a id="twitter-timeline" class="twitter-timeline" data-dnt="true"
       data-chrome="noheader nofooter noborders transparent"
       data-link-color="#2B7BB9" data-tweet-limit="3"
       href="https://twitter.com/sbmlnews?ref_src=twsrc%5Etfw"></a>
  </div>
</div>

<script src="/js/twitter-styling.js" type="text/javascript"></script>
