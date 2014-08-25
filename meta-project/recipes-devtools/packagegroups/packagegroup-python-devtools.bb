DESCRIPTION = "Python development tools"
LICENSE = "MIT"

inherit packagegroup

PACKAGES = "\
    packagegroup-python-core-tools \
    packagegroup-python-linux-tools \
"

RDEPENDS_packagegroup-python-linux-tools = "\
    python-pyudev \
    python-pyusb \
    python-smbus \
    python-pyserial \
    python-pya20 \
"

RDEPENDS_packagegroup-python-core-tools = "\
    python \
    python-pydoc \
    python-pprint \
    python-ctypes \
    python-math \
    python-json \
    python-xml \
    python-io \
    python-zlib \
    python-compression \
    python-shell \
    python-re \
"
