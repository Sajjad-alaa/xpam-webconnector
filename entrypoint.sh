#!/bin/bash
# XPAM WebConnector: container entry point (the database web console; its launcher registers with core).
# The service runs as its own user (uid 10004), not root: the data folder (a volume, root's on an installation from
# before) is given to that user here — not the certificates mounted read-only inside it — and the process gives up
# root and every capability before the launcher starts.

WC_UID=10004
if [ "$(id -u)" = 0 ]; then
    : ${LOG_LEVEL:='ERROR'}
    sed -i "s@root: INFO@root: ${LOG_LEVEL}@g" /opt/webconnector/config/application.yml
    mkdir -p /opt/webconnector/data
    find /opt/webconnector/data -path /opt/webconnector/data/certs -prune -o ! -uid "$WC_UID" \
        -exec chown "$WC_UID:$WC_UID" {} + || exit 1
    chmod 700 /opt/webconnector/data
    exec setpriv --reuid="$WC_UID" --regid="$WC_UID" --clear-groups --inh-caps=-all --bounding-set=-all \
        env HOME=/opt/webconnector/data "$0" "$@"
fi

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
