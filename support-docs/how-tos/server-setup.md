SBML Hugo server configuration
==============================

Here are the steps I took to install and set up the SBML Hugo server as a system service on a CentOS 7.8 computer.  (Note: all of the following commands are performed as root.)

Install files
-------------

Unless otherwise noted, in the instructions below, all commands are meant to be run as the root user.  If you prefer to use a regular account and prefix commands with `sudo`, add it to every command below.

1. Create a user account named `hugo` for the service on the host system.  Let it have its own group as is typical on CentOS 7 systems.  Here is the procedure used on one of our CentOS machines:
    ```shell
    useradd -m -U hugo
    ```

2. Install the [Hugo](https://github.com/gohugoio/hugo/releases) software to a location on the host computer.  For the purposes of this document, it's assumed the executable is placed in `/usr/local/bin/hugo`.

3. If you are _not_ running Hugo behind a proxy such as `haproxy`, you may need to enable the Hugo process (running as user `hugo`) to bind to TCP ports below 1024.  Some suggestions for how to do this are described in the section "Configuring the Hugo executable" in [`how-the-development-site-works.md`](how-the-development-site-works.md). If you _are_ running a proxy, then this may not be necessary.

4. Temporarily switch to user `hugo`, and clone the git repository for the SBML website, [`sbml-org-website`](https://github.com/sbmlteam/sbml-org-website), to a location on the computer, such as `/home/hugo/sbml`.  Make sure to use the `--recursive` option to `git clone`:

    ```shell
    su - hugo
    cd /home/hugo
    git clone --recursive https://github.com/sbmlteam/sbml-org-website.git sbml
    exit
    ```

5. Go to the `admin/system` subdirectory of the SBML website files, copy the `tmpfiles.d` configuration file to the proper location on your system, and (on CentOS 7.8) tell `systemd-tmpfiles` to create the files defined by the configuration:

    ```shell
    cd sbml/admin/system
    cp hugo-sbml-tmpfiles.conf /etc/tmpfiles.d/hugo-sbml.conf
    systemd-tmpfiles --create
    ```

6. Install the `systemd` script for the SBML Hugo server and tell `systemd` about it:

    ```shell
    cp hugo-sbml.service /etc/systemd/system/
    systemctl daemon-reload
    ```

7. If it is not already installed on your system, install the Apache HTTPD distribution version 2 or later.  The service definition relies on the [`rotatelogs`](https://httpd.apache.org/docs/current/programs/rotatelogs.html) program that comes with the Apache HTTPD software package.


Configure the SBML Hugo server
------------------------------

Edit the values in `admin/server.cfg` as needed.  The comments in the file explain what needs to be customized for a given server installation.


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
