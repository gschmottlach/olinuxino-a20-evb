DESCRIPTION = "This package provides a class to control the GPIO on \
the Olinuxino A20. The current release does not support any \
peripheral functions."
 
SECTION = "devel/python" 
LICENSE = "MIT" 
LIC_FILES_CHKSUM = "file://LICENSE.txt;md5=d20eb185c4100919a70e1a773825f09a"
HOMEPAGE = "https://pypi.python.org/pypi/pyA20" 
SRCNAME = "pyA20" 
DEPENDS += "python"
DEPENDS_virtclass-native += "python-native"

SRC_URI = "https://pypi.python.org/packages/source/p/${SRCNAME}/${SRCNAME}-0.1.6.tar.gz" 
SRC_URI[md5sum] = "ee29f1ced6366eced83724a6cd736c0e"
SRC_URI[sha256sum] = "bc4501dfd2188bed0025db46cea98f14de464ed47d6591e15b22a0ac9a8c684f"

S = "${WORKDIR}/${SRCNAME}-${PV}" 

inherit distutils 

BBCLASSEXTEND = "native"
