#!/bin/bash

read -d '' ARG0 <<"EOF"
bashscript.sh
EOF

read -d '' ARG1 <<"EOF"
1:3
1:5|1:2
1:3|1:1
1:2|1:0
1:1
EOF

read -d '' ARG2 <<"EOF"
2
EOF



read -d '' SCRIPT <<"EOF"
CODEGOLF_METHOD_PLACEHOLDER

EOF


/bin/bash -c "$SCRIPT"  "$ARG0" "$ARG1" "$ARG2"

