DESCRIPTION = "Base image for OLinuXino boards with Qt5 framebuffer support \
accelerated with the Mali OpenGl-ES2 drivers."

# Recipe revision
PR = "r2"

IMAGE_FEATURES += "splash package-management ssh-server-dropbear"

LICENSE = "MIT"

inherit core-image

IMAGE_BASENAME = "core-image-qt5-eglfs"
SDK_NAME = "${IMAGE_BASENAME}-sdk"

DISTRO_FEATURES_append = " glesv2"
CORE_IMAGE_EXTRA_INSTALL_append = " \
    sunxi-mali \
    packagegroup-qt-core \
    packagegroup-qt-dependencies \
    startup-scripts \ 
    connman \
    linux-firmware-ralink \
    curl \
    packagegroup-python-linux-tools \
    packagegroup-python-core-tools \
"
