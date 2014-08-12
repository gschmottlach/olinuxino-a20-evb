FILESEXTRAPATHS_prepend := "${THISDIR}/files:"
SRC_URI += "file://0017-eglfs-mali-native-window.patch \
"

CFLAGS += "-DEGL_NO_X11_HEADERS"
CXXFLAGS += "-DEGL_NO_X11_HEADERS"

# We don't have true OpenGl (only OpenGL-ES2) with the Mali graphics drivers
PACKAGECONFIG_remove = "gl"
PACKAGECONFIG_append = " ${@base_contains('DISTRO_FEATURES', 'opengl', 'glesv2', '', d)} icu iconv tslib alsa sql-sqlite fontconfig accessibility"
