#!/bin/bash

read -d '' ARG0 <<"EOF"
bashscript.sh
EOF

read -d '' ARG1 <<"EOF"
> <vv    <
 v ^ >v v 
  >v^^>vv^
    ^>^ v 
>  v<v  >>
  >v v<^  
EOF

read -d '' ARG2 <<"EOF"
3
EOF

read -d '' ARG3 <<"EOF"
2
EOF



read -d '' SCRIPT <<"EOF"
CODEGOLF_METHOD_PLACEHOLDER

EOF


/bin/bash -c "$SCRIPT"  "$ARG0" "$ARG1" "$ARG2" "$ARG3"

