DESCRIPTION = "This is a set of tools for recording from and playing back ROS message without \
relying on the ROS client library."
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "boost bzip2 gpgme libtinyxml2 console-bridge cpp-common class-loader roscpp-serialization roscpp-traits roslz4 rostime pluginlib std-msgs"
RDEPENDS_${PN} = "class-loader"

require ros-comm.inc

inherit catkin

ROS_PKG_SUBDIR = "tools"

