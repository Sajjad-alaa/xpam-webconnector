#!/bin/bash
#

if [ -n "$CORE_HOST" ]; then
    until check ${CORE_HOST}/api/health/; do
        echo "wait for jms_core ${CORE_HOST} ready"
        sleep 2
    done
fi

export GIN_MODE=release
export WORK_DIR=/opt/chen
export COMPONENT_NAME=chen
export WISP_TRACE_PROCESS=1
: ${EXECUTE_PROGRAM:="java -Dfile.encoding=utf-8 -XX:+ExitOnOutOfMemoryError -jar /opt/chen/chen.jar --mock.enable=false"}
export EXECUTE_PROGRAM

: ${LOG_LEVEL:='ERROR'}

sed -i "s@root: INFO@root: ${LOG_LEVEL}@g" /opt/chen/config/application.yml

echo
date
echo "XPAM WebConnector"
echo "Quit the server with CONTROL-C."
echo

# The launcher prints its settings at startup; keep the registration token out of the container log
exec "$@" > >(sed -u -E 's/(BootstrapToken:)[^ ]+/\1***/') 2>&1
