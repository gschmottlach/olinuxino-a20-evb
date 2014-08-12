DESCRIPTION = "Basic target packages for Qt5"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = "\
    packagegroup-qt-core \
    packagegroup-qt-dependencies \
"

RDEPENDS_packagegroup-qt-core = "\
    qt3d \
    qtbase \
    qtbase-fonts \
    qtbase-fonts-ttf-vera \
    qtbase-fonts-ttf-dejavu \
    qtbase-fonts-pfa \
    qtbase-fonts-pfb \
    qtbase-fonts-qpf \   
    qtbase-plugins \
    qtbase-tools \
    qtconnectivity \
    qtdeclarative \
    qtimageformats \
    qtmultimedia \
    qtquick1 \
    qtscript \
    qtsvg \
    qtsystems \
    qttools \
    qtxmlpatterns \
    qtwebkit-examples-examples \
    qtgraphicaleffects-qmlplugins \
    qtquickcontrols-qmlplugins \
    qtwebkit \
    cinematicexperience \
"

RDEPENDS_packagegroup-qt-dependencies = "\
    cairo \
    pango \
    fontconfig \
    freetype \
    pulseaudio \
    dbus \
    alsa-lib \
    alsa-tools \
    alsa-state \
    alsa-utils-alsaconf \
    i2c-tools \
    sqlite3 \ 
"
