#!/bin/bash

read -d '' ARG0 <<"EOF"
bashscript.sh
EOF

read -d '' ARG1 <<"EOF"
5
EOF

read -d '' ARG2 <<"EOF"
.           . $ $  
|           | \\ \\  
|     .  $  | | | $
| . . \\  |  | / / |
| | | /  |    | | |
X X X X  X    X X X
EOF



read -d '' SCRIPT <<"EOF"
CODEGOLF_METHOD_PLACEHOLDER

EOF


/bin/bash -c "$SCRIPT"  "$ARG0" "$ARG1" "$ARG2"

