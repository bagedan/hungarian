#!/bin/bash

read -d '' ARG0 <<"EOF"
bashscript.sh
EOF

read -d '' ARG1 <<"EOF"
Mushroom piranha piranha piranha Princess
EOF



read -d '' SCRIPT <<"EOF"
CODEGOLF_METHOD_PLACEHOLDER

EOF


/bin/bash -c "$SCRIPT"  "$ARG0" "$ARG1"
