SBML Hugo server configuration
==============================

Here are the steps I took to install and set up the SBML Hugo server as a system service on a CentOS 7.8 computer.  (Note: all of the following commands are performed as root.)

Install files
-------------

1. Install [Hugo](https://github.com/gohugoio/hugo/releases) to a location on the host computer.  We put the executable in `/usr/local/bin/hugo`.

2. If applicable, follow the instructions to enable Hugo to access ports below 1024, as mentioned in the section "Configuring the `hugo` executable" in [`how-the-development-site-works.md`](how-the-development-site-works.md).

3. Create a user account named `hugo` for the service on the host system.  Let it have its own group as is typical on CentOS 7 systems.

4. Clone the website git repository, [`sbml-org-website`](https://github.com/sbmlteam/sbml-org-website), to a location on the computer, such as `/home/hugo/sbml`.  Make sure to use the `--recursive` option to `git clone`:

    ```shell
    cd /home/hugo
    git clone --recursive https://github.com/sbmlteam/sbml-org-website.git sbml
    ```

5. Change the group of the directory you just cloned to be owned by user `hugo`:

    ```shell
    chown -R hugo:hugo sbml
    ```

6. Go to the `admin/system` subdirectory of the SBML website files, copy the `tmpfiles.d` configuration file to the proper location on your system, and (on CentOS 7.8) tell `systemd-tmpfiles` to create the files defined by the configuration:

    ```shell
    cd sbml/admin/system
    cp hugo-sbml-tmpfiles.conf /etc/tmpfiles.d/hugo-sbml.conf
    systemd-tmpfiles --create
    ```

7. Install the `rsyslogd` configuration file for the SBML hugo server, and tell `rsyslogd` to load it:

    ```shell
    cp hugo-sbml-rsyslog.conf /etc/rsyslog.d/hugo-sbml.conf
    systemctl restart rsyslog
    ```

8. Install the `systemd` script for the SBML Hugo server and tell `systemd` about it:

    ```shell
    cp hugo-sbml.service /etc/systemd/system/
    systemctl daemon-reload
    ```

9. Install the `logrotate` script:

    ```shell
    cp hugo-sbml-logrotate.txt /etc/logrotate.d/hugo-sbml
    ```


Configure the SBML Hugo server
------------------------------

Edit the values in `admin/server.cfg` as needed.


Start the service
-----------------

Now, at this point, everything is in place, and what remains is to tell the operating system to install the new service and start it up.  Before going further, it may be helpful to open **two** more sh windows and do (1) a `tail -f /var/log/messages` in one of the windows and (2) a `tail -f /var/log/hugo/hugo.log` in the other, to keep an eye for system messages.

1. Enable the new service:

    ```shell
    systemctl enable hugo-sbml
    ```

2. Start the service:

    ```shell
    systemctl start hugo-sbml
    ```

3. Check the status:

    ```shell
    systemctl status hugo-sbml
    ```


Additional help
---------------

The tutorial ["How To Use Systemctl to Manage Systemd Services and Units"](https://www.digitalocean.com/community/tutorials/how-to-use-systemctl-to-manage-systemd-services-and-units) by Justin Ellingwood (2015-02-01; backup copy [available here](https://web.archive.org/web/20200817210556/https://www.digitalocean.com/community/tutorials/how-to-use-systemctl-to-manage-systemd-services-and-units)) is very helpful and explains how to use `systemd`.