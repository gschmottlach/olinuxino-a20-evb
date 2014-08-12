FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += "file://0001-Add-missing-GLchar-definition-some-gl-gles-apps-need.patch \
            file://0002-Fix-sed-to-replace-by-the-correct-var.patch \
            file://0003-Fix-qt5-build-with-eglfs.patch \
            "

do_install_pkgconfig() {
    install -d ${D}${libdir}/pkgconfig
    install egl.pc gles_cm.pc glesv2.pc ${D}${libdir}/pkgconfig
}

addtask install_pkgconfig after do_install before do_package

FILES_${PN}-dev += "${libdir}/pkgconfig/*.pc"

do_configure() {
         DESTDIR=${D}/ VERSION=r3p0 ABI=armhf EGL_TYPE=framebuffer ${EXTRA_OECONF} make config
}
