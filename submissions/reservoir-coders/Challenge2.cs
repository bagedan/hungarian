static void f(string s){var d=(new[]{"`1234567890-=~!@#$%^&*()_+","qwertyuiop[]\\QWERTYUIOP{}|","asdfghjkl;'ASDFGHJKL:\"","zxcvbnm,./ZXCVBNM<>?"}).ToDictionary(o=>o,o=>{var c=s.Count(p=>o.Contains(p));return c==0?999:c;});d.Where(k=>k.Value==d.Values.Min()).OrderBy(k=>k.Key.Intersect(s).Count()).First().Key.Where(c=>s.Contains(c)).ToList().ForEach(Console.Write);}