DESCRIPTION = "console_bridge is a ROS-independent, pure CMake package that provides logging \
calls that mirror those found in rosconsole, but for applications that are not necessarily using \
ROS."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "\
    file://include/console_bridge/console.h;beginline=1;endline=33;md5=279eed49072cc9f6ebe38974afcc4803 \
    file://src/console.cpp;beginline=1;endline=33;md5=279eed49072cc9f6ebe38974afcc4803 \
"

DEPENDS = "boost"

SRC_URI = "git://github.com/ros/console_bridge.git;protocol=https"
SRCREV = "f0b423c0c2d02651db1776c96887c0a314908063"

S = "${WORKDIR}/git"
BBCLASSEXTEND = "native nativesdk"

inherit cmake ros faulty-solibs

# Exclude libconsole_bridge.so from shlibs to support coexistence of ROS1 and ROS2
PRIVATE_LIBS = "libconsole_bridge.so"
FILES_${PN}-dev += "\
                ${libdir}/libconsole_bridge.so \
                ${libdir}/console_bridge/cmake/* \
                "
