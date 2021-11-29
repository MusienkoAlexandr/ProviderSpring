#!/bin/sh
cd $(dirname $0)
PATH="$PWD/node/":"$PWD":$PATH
node_modules/@angular/cli/bin/ng "$@"
read -n 1 -r -s -p $'Press enter to continue...\n'