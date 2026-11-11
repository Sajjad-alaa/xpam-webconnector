#!/bin/bash
# XPAM WebConnector: container entry point (the database web console; its launcher registers with core).

if [ -n "$CORE_HOST" ]; then
    until check ${CORE_HOST}/api/health/; do
        echo "waiting for core at ${CORE_HOST}"
        sleep 2
    done
fi

export GIN_MODE=release
export WORK_DIR=/opt/webconnector
export COMPONENT_NAME=chen   # (the component type core knows this service by)
export WISP_TRACE_PROCESS=1
: ${EXECUTE_PROGRAM:="java -Dfile.encoding=utf-8 -XX:+ExitOnOutOfMemoryError -jar /opt/webconnector/webconnector.jar --mock.enable=false"}
export EXECUTE_PROGRAM

: ${LOG_LEVEL:='ERROR'}

sed -i "s@root: INFO@root: ${LOG_LEVEL}@g" /opt/webconnector/config/application.yml

# (the log file was named chen.log before: an upgraded installation keeps its log under the new name)
if [ -f data/logs/chen.log ] && [ ! -f data/logs/webconnector.log ]; then
    mv data/logs/chen.log data/logs/webconnector.log
fi

echo
date
echo "XPAM WebConnector"
echo "Quit the server with CONTROL-C."
echo

# The launcher prints its settings at startup; keep the registration token out of the container log
exec "$@" > >(sed -u -E 's/(BootstrapToken:)[^ ]+/\1***/') 2>&1
