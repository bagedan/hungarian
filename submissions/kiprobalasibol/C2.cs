static void f(string t,string s,int n){Console.Write(n*s.Length + t.Split(new string[]{s},StringSplitOptions.None).Sum(i=>(n--)>=0?i.Length:0));}