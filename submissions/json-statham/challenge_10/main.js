function f(n, scene) {
    // transpond
    t = a => a.reduce((a, b) => b.map((c, i) => a[i] = (a[i] || []).concat(c)) && a, []);
    // transponded
    u = t(scene.split('\n').map(r => r.split(''))).map(r => r.reverse());

    v = c => t => (d = t.reduce((a, b) => (r = (x, y) => [a[0] + x, y, a[2] + 1]) && a[1] ? (b == '|' ? r(0, a[1]) : b == '\\' ? r(-1, a[0] > -1) : b == '/' ? r(1, a[0] < 1) : a) : a, [0, true, 1])) && [t[0] == 'X' && d[0] == 0 && d[1] && t[d[2]] == c, d[2]];
    w = u.filter(t => v('$')(t)[0]).length;
    var m = u.reduce((a, b) => {
        x = v('.')(b);
        if(a > 0 && x[0]) {
            b[x[1]] = '$';
            return a - 1;
        }

        return a;
    }, n - w);

    console.log(n == m ? ':(' : m ? m : t(u).map(r => r.join('')).reverse().join('\n'));
}