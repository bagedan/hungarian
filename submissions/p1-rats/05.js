function f(e){for(i=e,e="",x=100;x>0;)i=i.replace(/ \\|\/ |^\\|\/$/g,"__").replace(/\/\|(?!\\)/g,"//a").replace(/(\/)?\|\\/g,function(e,i){return i?e:"a\\\\"}).replace(/a/g,''),e==i&&(x=0),e=i;console.log(i)}