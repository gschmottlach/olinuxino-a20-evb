require core-image-olinuxino.bb

DESCRIPTION = "OLinuXino support that includes everything within \
core-image-olinuxino plus meta-toolchain, development headers and libraries to \
form a standalone SDK."

#QT4PKG = "qt4-pkgs"
#QT4PKG_mips64 = ""

IMAGE_FEATURES += "dev-pkgs tools-sdk \
	tools-debug eclipse-debug tools-profile tools-testapps debug-tweaks ssh-server-openssh"

IMAGE_INSTALL += "kernel-dev"

