DESCRIPTION = "Mali wayland-egl library based on Mesa's implementation."
PR = "r0"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=4580336f8ac7357ef194583a4e7416bb"

COMPATIBLE_MACHINE = "(mele|meleg|cubieboard|cubieboard2|cubietruck|olinuxino-a10|olinuxino-a13|olinuxino-a20)"

PROVIDES = "virtual/wayland-egl"

inherit distro_features_check cmake pkgconfig
REQUIRED_DISTRO_FEATURES = "opengl"

DEPENDS = "sunxi-mali wayland"

SRC_URI = "file://wayland-egl-1.4.0.tgz \
          "

S = "${WORKDIR}/${PN}-${PV}"

EXTRA_OECMAKE = "-DCMAKE_INSTALL_PREFIX=${prefix} -DCMAKE_BUILD_TYPE=Release"

python __anonymous() {
    extra_oecmake = d.getVar('EXTRA_OECMAKE', True).split()
    pv = d.getVar("PV", True).split('.')
    extra_oecmake.append("-DWAYLAND_EGL_MAJOR_VERSION=%s" % pv[0])
    extra_oecmake.append("-DWAYLAND_EGL_MINOR_VERSION=%s" % pv[1])
    extra_oecmake.append("-DWAYLAND_EGL_RELEASE_VERSION=%s" % pv[2])
    d.setVar('EXTRA_OECMAKE', ' '.join(extra_oecmake))
}


