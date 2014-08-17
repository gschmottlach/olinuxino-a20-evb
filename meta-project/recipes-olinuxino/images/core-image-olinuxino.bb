DESCRIPTION = "Base image for OLinuXino boards."

IMAGE_FEATURES += "splash package-management ssh-server-dropbear"

LICENSE = "MIT"

inherit core-image

CORE_IMAGE_EXTRA_INSTALL_append = " \ 
    connman \
    linux-firmware-ralink \
    curl \
"

