DESCRIPTION = "Base image for OLinuXino boards with OpenGL and Wayland \
support."

IMAGE_FEATURES += "splash package-management ssh-server-dropbear"

LICENSE = "MIT"

inherit core-image

DISTRO_FEATURES_append = " opengl wayland"
CORE_IMAGE_EXTRA_INSTALL += "sunxi-mali wayland weston"

#IMAGE_INSTALL += "packagegroup-core-x11-sato-games"
