## Using Pivotal Tracker

[Pivotal Tracker](https://www.pivotaltracker.com) is a free Agile project-planning tool used by the SBML Team for planning and coordinating software development activities. The rest of this page for information about our conventions for using Pivotal.

### Basic orientation and usage information

* The [Getting started page](https://www.pivotaltracker.com/help/gettingstarted) at Pivotal Tracker is definitely worth reading. The [YouTube video](http://www.youtube.com/watch?v=bzCZysm5lG8) introducing the concepts in Pivotal is worth watching too, but be warned that the pace of the video is relatively fast, so you probably will want to keep stopping and replaying parts of it.

* <strike>We have tended to use the power-of-two point scale (1, 2, 4, 8, ...).</strike>We switched to using a custom scale: 0,1,2,4,8,16,40.  Our numbers correspond roughly to hours of work, even though we know that points in Pivotal (and similar Scrum-style development approaches) argue that points should not be equated to time.  For us, it makes sense to relate the numbers to time.

* We use the Pivotal Tracker setting for <em>"Bugs and Chores May Be Given Points"</em> so that we can assign points to chores and bugs.  The P.T. documentation states that this is strongly discouraged and gives explanations for why, but in our use, we simply find it more useful to count them.

* We use Pivotal Tracker's "Epics" to subdivide overall projects into subprojects. Each subproject task is labeled with the link label of the Epic with which it is associated.

* We use the integration facility to integrate with the [@sbmlnews](https://twitter.com/sbmlnews) Twitter feed for most projects.

### Creating a story

* When creating a story, give it a title that someone _else_ (in particular, the project lead) will understand. 

* Use an action verb in the title and make the title describe what needs to be done.  A story stands for an action, so make the title reflect that.  Examples of good and bad titles:

| Bad story title | Good story title |
|-----------------|------------------|
| "piecewise bug" | "Fix handling of <piecewise> for case of no arguments" |
  | "MIRIAM rdf:about attribute" | "Detect if rdf:about is empty or annotation lacks metaid" |

  * Make sure to fill in the description for the story.  Again, think of someone else (or even you, days or weeks later) reading the story and trying to understand what it's about.

  * Tag the story with the appropriate tags, or create a new tag if warranted.

  * If you're still in the exploratory phase of bug-hunting or design (you know something is wrong, but you don't know why; you know you want to do something but you don't know how) create a story about that:  'Investigate why [x] fails'; 'Decide how to [y]'.  Use the 'design' tag if appropriate.  After this is completed, you can then create a new story about actually accomplishing what you decided to do in this one.

  ### Using and managing tags

  * When creating a tag, make it as short a name as you can while keeping the meaning clear.  Long tags, especially when a story has multiple tags, make the stories take up more space in the list.

  * Stories should be <em>"accepted"</em> by someone other than the person working on them.  Normally it would be the case that the person who requests a story is the one who would check and accept it, but often it happens that the same person who does the work also thought of and created the story in the first place.  In order to work around that problem, we've been using the convention that we tag each story with a tag of the form <code>accept-by-<i><u>name</u></i></code>, where <code><i><u>name</u></i></code> is the name of the person who should check it and click <em>accept</em> when the time comes.

  * The project owner should periodically (e.g., 1/week) look over all the stories and tag or retag them as necessary, and also consider creating new tags or consolidating others.  The "Labels & Searches" panel is especially useful for this.

  ### Using and managing points

  * In order to be able to use the time estimation features of Pivotal, and the charts for burn-down, the stories have to be accepted on a regular basis.  If you're the project owner, at the end of every weekday, look over the project stories and accept those that you can.  Note that accepting a story implies a certain amount of verification: when looking to accept stories, try to go and check what the story was about and try to see that the feature/bug/whatever is done.  Therefore, you need to expect that the process of accepting stories may involve some time and work, and plan accordingly.

