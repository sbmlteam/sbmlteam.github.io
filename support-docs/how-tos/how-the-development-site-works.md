How the development/preview site works
======================================

The SBML Team runs a live development server so that we can all see a preview of any changes planned for the production site (the actual SBML.org).  Here is how that development server is set up.


Operating system basics
-----------------------

The server is a CentOS system running a Dell desktop computer located in Mike Hucka's office on the Caltech campus.  The computer is set up as a fairly basic CentOS server, and runs only a couple of services.  It allows ssh connections only from Caltech IP addresses.

On our development server, we download and store copies of the Hugo distribution files are kept in `/usr/local/src/HOSTNAME/hugo` and the Hugo binary itself is `/usr/local/bin/hugo`.


Configuring the `hugo` executable
----------------------------------

For security reasons, we do not run the Hugo server as root.  There is a separate system account for running `hugo`.

On CentOS and similar Linux systems, non-root processes cannot bind to port numbers below 1024.  If you want to use port 80 for a server, you need to adjust the security settings.  Several alternatives exist.  One particularly easy way to do it (if you can afford the security risks) is to use `setcap`.  For example, if your copy of `hugo` is `/usr/local/bin/hugo`, 
```
setcap 'cap_net_bind_service=+ep' /usr/local/bin/hugo
```
This must be performed after every update of the binary.


Organizing the Hugo server contents
-----------------------------------

The files for the copy of the SBML site are located in `/home/hugo/sbml/`.  A shell script ([`admin/server-control`](../../admin/server-control)) controls starting/stopping the Hugo server.

