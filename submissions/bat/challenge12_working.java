static void f(String s,int p,int q){String[]l=s.split("\n");int e=l.length;int f=l[0].length();char[][]c=new char[e][f];for(int i=0;i<e;i++){for(int j=0;j<f;j++){c[i][j]=l[i].length()>j?l[i].charAt(j):' ';}}System.out.print(new C().s(c,e,f,q,p));}static class P{int x;int y;P(int xx,int yy){x=xx;y=yy;}public boolean equals(Object o){if(this==o){return true;}if(!(o instanceof P)){return false;}P pos=(P)o;return x==pos.x&&y==pos.y;}public int hashCode(){return Objects.hash(x,y);}}static class C{boolean h=true;boolean v=true;int s(char[][]c,int d,int e,int f,int g){Set<P>s=new HashSet<>();P n=new P(0,0);s.add(n);P m=new P(1,0);while(true){m=c(c,n,d,e,f,g,m);P p=n;n=new P(n.x+m.x,n.y+m.y);if(p.equals(n))return 9;if(s.contains(n))return 8;if(n.x>e||n.x+g<0||n.y>d||n.y+f<0)return 9;s.add(n);}}P c(char[][]c,P s,int d,int e,int f,int g,P p){int[]m=new int[4];for(int i=0;i<f;i++){for(int j=0;j<g;j++){if(!(s.x+j>=e||s.x+j<0||s.y+i>=d||s.y+i<0)){char q=c[s.y+i][s.x+j];if(q=='^')m[0]--;else if(q=='v')m[0]++;else if(q=='>')m[1]++;else if(q=='<')m[1]--;else if(q=='W')m[2]++;else if(q=='w')m[2]--;else if(q=='H')m[3]++;else if(q=='h')m[3]--;}}}if(m[2]!=0)v=m[2]>0?true:m[2]<0?false:v;if(m[3]!=0)h=m[3]>0?true:m[3]<0?false:h;int y=v?or(m[0],0):0;int x=h?or(m[1],0):0;boolean v=p.x!=0&&h;boolean w=p.y!=0&&this.v;boolean a=v||w;if(y<0){if(x<=0){if(y<x)return new P(0,-1);if(x<y)return new P(-1,0);if(a&&x!=0)return v?new P(-1,0):new P(0,-1);return new P(0,0);}else{if(-y>x)return new P(0,-1);if(-y<x)return new P(1,0);if(a&&x!=0)return v?new P(1,0):new P(0,-1);return new P(0,0);}}else{if(x>0){if(x>y)return new P(1,0);if(y>x)return new P(0,1);if(a&&x!=0)return v?new P(1,0):new P(0,1);return new P(0,0);}else{if(y>-x)return new P(0,1);if(-x>y)return new P(-1,0);if(a&&x!=0)return v?new P(-1,0):new P(0,1);return new P(0,0);}}}int or(int x,int o){return x==0?o:x;}}