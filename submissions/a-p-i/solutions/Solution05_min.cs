static void f(String s){String x = "";var p = new List<Tuple<String, String, int>>();p.Add(new Tuple<string, string, int>(@"\|\|\\", @"|\\", 3));p.Add(new Tuple<string, string, int>(@"/\|\|", @"//|", 3));p.Add(new Tuple<string, string, int>(@"/ ", @"__", 2));p.Add(new Tuple<string, string, int>(@"/\| ", @"// ", 3));p.Add(new Tuple<string, string, int>(@" \|\\", @" \\", 3));p.Add(new Tuple<string, string, int>(@" \\", @"__", 2));p.Add(new Tuple<string, string, int>(@"/\|\|\\", @"//\\", 4));p.Add(new Tuple<string, string, int>(@"/$", @"__", 1));p.Add(new Tuple<string, string, int>(@"/\|$", @"//", 2));p.Add(new Tuple<string, string, int>(@"^\|\\", @"\\", 2));p.Add(new Tuple<string, string, int>(@"^\\", @"__", 1));p.Add(new Tuple<string, string, int>(@"/ \\", @"__\", 3));while (!s.Equals(x)){x = String.Copy(s);foreach (var n in p){foreach (Match match in Regex.Matches(s, n.Item1)){x = x.Remove(match.Index, n.Item3);x = x.Insert(match.Index, n.Item2);}}String t = s;s = x;x = t;}Console.WriteLine(x);}