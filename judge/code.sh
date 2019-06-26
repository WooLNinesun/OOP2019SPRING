#!/usr/bin/env bash

problem="${1}"; subcmd="${2}"; sample="${3}"

if [ -d ${problem} ]; then cd ${problem}
else
    echo "${problem} - unknown problem id"; exit 1;
fi

function code_run() {
    if (javac *.java); then
        java Tester
    fi
}

case "${subcmd}" in
    clean ) rm *.class 2>/dev/null ;;
    run   ) code_run ${sample} ;;

    * ) echo "${0}: '${subcmd}' - unknown argument!"; exit 1 ;;
esac
