FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI += "file://0002-remove-egl-versioning.patch"

DEPENDS += "wayland-egl"
