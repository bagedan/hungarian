function f(input) {
    // original input with whitespaces
    o = ` ${input} `;
    // temp string (mutated)
    s = o;
    // replace
    p = d => o.split('').map((c, i) => !o.startsWith(['/|\\', '\\|/'][d], i) && [[['/ ', '__'], ['/|', '//']], [['\\ ', '__'], ['\\|', '\\\\']]][d].find(t => o.startsWith(t[0], i))).map((t, i) => t && (s = s.substring(0, i) + s.substring(i).replace(t[0], t[1])));
    p(0);
    // reverse
    r = x => x.split('').reverse().join('');
    s = r(s);
    o = r(o);
    p(1);
    n = r(s);
    s != o ? f(n) : console.log(n);
}