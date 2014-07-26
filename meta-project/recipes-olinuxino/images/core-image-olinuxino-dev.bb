require core-image-olinuxino.bb

DESCRIPTION = "OLinuXino for development work. It includes everything \
within core-image-olinuxino plus a native toolchain, application development and \
testing libraries, profiling and debug symbols."

IMAGE_FEATURES += "dev-pkgs"
