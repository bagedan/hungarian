static void f(string p){var l=String.Join("",File.ReadAllLines(p));int h=0,m=0,n=0;Action<int,int,int,int>q=(v,w,z,t)=>{if((l[v]&l[w])>32){m=z;h=t;}else if(l[w]>32)n=t;};q(0,6,55,11);q(2,7,0,12);q(4,8,5,1);q(10,11,45,9);q(14,13,15,3);q(20,16,35,7);q(22,17,30,6);Console.Write((l.Count(j=>j>32)<4?h:n)+":"+m);}