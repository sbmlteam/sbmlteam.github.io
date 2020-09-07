SBML Hugo server configuration
==============================

Here are the steps I took to install and set up the SBML Hugo server as a system service on a CentOS 7.7 computer.  (Note: all of the following commands are performed as root.)

Install files
-------------

1. Install [Hugo](https://github.com/gohugoio/hugo/releases) to a location on the host computer.  We put the executable in `/usr/local/bin/hugo`.

2. If applicable, follow the instructions to enable Hugo to access ports below 1024, as mentioned in the section "Configuring the `hugo` executable" in [`how-the-development-site-works.md`](how-the-development-site-works.md).

3. Create a user account named `hugo` for the service on the host system.  Let it have its own group as is typical on CentOS 7 systems.

4. Clone the website git repository, [`sbml-org-website`](https://github.com/sbmlteam/sbml-org-website), to a location on the computer, such as `/home/hugo/sbml`.  Make sure to use the `--recursive` option to `git clone`:

    ``` shell
    cd /home/hugo
    git clone --recursive https://github.com/sbmlteam/sbml-org-website.git sbml
    ```

5. Staying in the directory where you cloned the website, change the group of the website directory to be owned by user `hugo`:

    ``` shell
    chown -R hugo:hugo .
    ```

6. Create a directory in `/var/run` where the user `hugo` can write the process id file:

    ``` shell
    mkdir /var/run/hugo
    chown hugo:hugo /var/run/hugo
    ```

6. Go to the `admin/system` subdirectory of the SBML website files, install the `rsyslogd` configuration file for the SBML hugo server, and tell `rsyslogd` to load it:

    ``` shell
    cd /home/hugo/sbml/admin/system
    cp hugo-sbml-rsyslog.conf /etc/rsyslog.d/hugo-sbml.conf
    mkdir /var/log/hugo
    chown hugo:hugo /var/log/hugo
    systemctl restart rsyslog
    ```

7. Install the `systemd` script for the SBML Hugo server and tell `systemd` about it:

    ``` shell
    cp hugo-sbml.service /etc/systemd/system/
    systemctl daemon-reload
    ```

8. Install the `logrotate` script:

    ``` shell
    cp hugo-sbml-logrotate.txt /etc/logrotate.d/hugo-sbml
    ```


Configure the SBML Hugo server
------------------------------

Edit the values in `admin/server.cfg` as needed.


Start the service
-----------------

Now, at this point, everything is in place, and what remains is to tell the operating system to install the new service and start it up.  Before going further, it may be helpful to open another window and do a `tail -f /var/log/messages` to keep an eye for system messages.

1. Enable the new service:

    ``` shell
    systemctl enable hugo-sbml
    ```

2. Start the service:

    ``` shell
    systemctl start hugo-sbml
    ```

3. Check the status:

    ``` shell
    systemctl status hugo-sbml
    ```

