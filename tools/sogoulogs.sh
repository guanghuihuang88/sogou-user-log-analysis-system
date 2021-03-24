#!/bin/sh
home=$(cd `dirname $0`; cd ..; pwd)
. ${home}/bin/common.sh
echo "start analog data ****************"
java -jar ${lib_home}/analogSogoulogData.jar  ${data_home}/sogoulogs.log ${data_home}/test.log
