Server control and administration files
=======================================

The files in this directory are suitable for running a local web server for site development purposes.  The approach described here uses Hugo's built-in server.

0. You will need a version of Hugo at least 0.68 if not higher.
1. Copy the the file `server.cfg.template` to `server.cfg`, and edit this `server.cfg` to suit your installation. You will probably not have to change anything unless you have some exceptional requirements.  For example, you should not run a public version of the site, so the value of `SITE_URL`, `SITE_IP`, and `SITE_PORT` should be left blank.  (Hugo will generate a port itself &ndash; you normally don't need to set it for local development.)
2. Use `server-control` to start/stop the server.  This is a control script in the manner of `/etc/init.d/ABC` scripts  common to CentOS and other Linux systems.  It takes arguments `start`, `stop`, `restart`, and `status`.

In general, after cloning the git repository, it should be enough to do the following (assuming your shell's current directory is the top of the repository copy):

``` shell
admin/server start
tail -f run/hugo.log
```

Hugo will print the port where it is running on your local machine.  It is usually 1313, which means the local website address will be [`http://localhost:1313`](http://localhost:1313).

