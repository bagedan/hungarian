function f(o){function r(o,r){return o-r}var n={},c=[],f="";return o.split("").forEach(function(o){var r=o.charCodeAt(0);n[r]?n[r]++:n[r]=1}),Object.keys(n).sort(r).forEach(function(o){var r=n[o];c[r]?c[r].push(o):c[r]=[o]}),c.forEach(function(o,r){o.forEach(function(o){for(var n=0;r>n;n++)f+=String.fromCharCode(o)})}),console.log(f),f}
