require conf/license/license-gplv2.inc
LICENSE = "GPLv2"


PV = "1.0"
PR = "r0"

SRC_URI = "file://wetek-shutdown.sh"

INITSCRIPT_NAME = "wetek-shutdown"
INITSCRIPT_PARAMS = "start 39 0 ."

inherit autotools pkgconfig update-rc.d

S = "${WORKDIR}"

do_install() {
    install -d ${D}/etc/init.d/
    install -m 0755 ${WORKDIR}/wetek-shutdown.sh ${D}/etc/init.d/wetek-shutdown
}

PACKAGE_ARCH = "${MACHINE_ARCH}"

