DESCRIPTION = "ROS console output library."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=68b329da9893e34099c7d8ad5cb9c940"

DEPENDS = "apr boost cpp-common log4cxx rostime rosunit"

SRC_URI = "git://github.com/ros/rosconsole.git;protocol=https;branch=melodic-devel"
SRCREV = "ba4e1ae06b5bce3039ac5d20853248b51198e431"

S = "${WORKDIR}/git"
inherit catkin
