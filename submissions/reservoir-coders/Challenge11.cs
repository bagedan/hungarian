static void f(string st){var ht = st.Contains("@");var s = st.Replace("\r","").Split('\n').Where(z => z.Length>0).ToArray();int height = s.Length;int w = s[0].Length;var b = new List<List<Beam>>();for (var x = 0;x<height;++x)for (var y = 0;y<w;++y){var c = s[x][y];if (c=='v')	b.Add(new List<Beam>() { new Beam() { X=x,Y=y,d=D.D } });if (c=='^'){	b.Add(new List<Beam>() { new Beam() { X=x,Y=y,d=D.U } });	if (x>0) if (s[x-1][y]=='v') { Console.WriteLine(":/"); return; };}if (c=='<'){	b.Add(new List<Beam>() { new Beam() { X=x,Y=y,d=D.L } });	if (y>0) if (s[x][y-1]=='>') { Console.WriteLine(":/"); return; };}if (c=='>')	b.Add(new List<Beam>() { new Beam() { X=x,Y=y,d=D.R } });}Console.WriteLine(r(ht,s,b));}enum D { D, U, L, R, N }class Beam { public int X; public int Y; public D d; }static Tuple<int,int> matchingPortal(string[] st,char p,int i,int j){int h = st.Length;int w = st[0].Length;for (var x = 0;x<h;++x)for (var y = 0;y<w;++y)if (!(x==i&&y==j)&&st[x][y]==p)	return Tuple.Create(x,y);return null;}static string r(bool ht,string[] st,List<List<Beam>> b){if (ht&&!st.SelectMany(s=>s.ToCharArray()).Any(c=>c=='@'))return":D";int h = st.Length;int w = st[0].Length;if (!b.Where(m=>m.Last().d!=D.N).Any())return":(";foreach (var e in b){var x = e.Last().X;var y = e.Last().Y;if (x<0||y<0||x>=h||y>=w) e.Last().d=D.N;if (0<=x&&x<h&&0<=y&&y<w){var c = st[x][y];if (c=='#'||	e.Count()>1&&(c=='<'||c=='v'||c=='>'||c=='^'))	e.Last().d=D.N;if (c=='@'){	st[x]=st[x].Substring(0,y)+'#'+st[x].Substring(y+1);	e.Last().d=D.N;}if (c=='\\'){	if (e.Last().d==D.U) e.Last().d=D.L;	else if (e.Last().d==D.D) e.Last().d=D.R;	else if (e.Last().d==D.R) e.Last().d=D.D;	else if (e.Last().d==D.L) e.Last().d=D.U;}if (c=='/'){	if (e.Last().d==D.U) e.Last().d=D.R;	else if (e.Last().d==D.D) e.Last().d=D.L;	else if (e.Last().d==D.R) e.Last().d=D.U;	else if (e.Last().d==D.L) e.Last().d=D.D;}if (c>='0'&&c<='9'){	var t = matchingPortal(st,c,x,y);	e.Add(new Beam() { d=e.Last().d,X=t.Item1,Y=t.Item2 });}}}foreach (var m in b)foreach (var n in b){if (m==n)	continue;foreach (var b1 in m)	foreach (var b2 in n)	{		if (b1.X==b2.X&&b1.Y==b2.Y&&!(b1.d==D.N||b2.d==D.N))		{			var k = st[b1.X][b1.Y];			if ("<>^v#".Contains(k)) continue;			if ("0123456789".Contains(k))			{				if (b1.d==D.D&&b2.d==D.U||b1.d==D.U&&b2.d==D.D||b1.d==D.L&&b2.d==D.R||b1.d==D.R&&b2.d==D.L)					return":/";				continue;			}			if ((k=='/'||k=='\\'))			{				bool s=k=='\\'&&(b1.d==D.U&&b2.d==D.R||b1.d==D.D&&b2.d==D.L||b1.d==D.L&&b2.d==D.D||b1.d==D.R&&b2.d==D.U)||(k=='/'&&(b1.d==D.U&&b2.d==D.L||b1.d==D.D&&b2.d==D.R||b1.d==D.L&&b2.d==D.U||b1.d==D.R&&b2.d==D.D));				if (s)					return":/";				continue;			};			return ":/";		}	}}foreach (var m in b){if (m.Last().d==D.N)continue;var x = m.Last().X;var y = m.Last().Y;switch (m.Last().d){case D.U:x--;break;case D.D:x++;break;case D.L:y--;break;case D.R:y++;break;}m.Add(new Beam() {d=m.Last().d,X=x,Y=y});}return r(ht,st,b);}