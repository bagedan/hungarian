static<T>void Q(T o){System.out.print(o);}static void f(String m){List<L> l=new ArrayList();for(int i=0;i<s(m).x;i++){for(int j=0;j<s(m).y;j++){C f=new C(i,j);char c=get(m,i,j);if(c=='>'){l.add(new L(f,new C(1,0)));}else if(c=='<'){l.add(new L(f,new C(-1,0)));}else if(c=='v'){l.add(new L(f,new C(0,1)));}else if(c=='^'){l.add(new L(f,new C(0,-1)));}}}for(int b=0;b<1000;b++){for(L z:l){z.p(m);}for(L e:l){for(L w:l){if(e!=w){for(C c:e.h){if(w.h.contains(c)){char I=get(m,c.x,c.y);if(I=='/'){C A=new C(c.x,c.y);int J=e.h.indexOf(A);C P=e.h.get(J+1);int H=w.h.indexOf(A);C Z=w.h.get(H+1);C Y=A.y(P);C G=A.y(Z);if(Y.equals(G)|g(Y,'/').equals(G.x())){Q(":/");return;}}else if(I=='\\'){C L=new C(c.x,c.y);int E=e.h.indexOf(L);C M=e.h.get(E+1);int W=w.h.indexOf(L);C D=w.h.get(W+1);C d=L.y(M);C T=L.y(D);if(d.equals(T)|g(d,'\\').equals(T.x())){Q(":/");return;}}else if(I!='@'&!(I>='0'&I<='9')){Q(":/");return;}}}}}}boolean f=2>1;for(int i=0;i<s(m).x;i++){for(int j=0;j<s(m).y;j++){if(get(m,i,j)=='@'){boolean k=1>2;for(L z:l){if(z.h.contains(new C(i,j))){k=2>1;}}if(!k){f=1>2;}}}}if(f){Q(":D");return;}}Q(":(");return;}static char get(String map,int x,int y){String[]Z=map.split("\n");if(y<0|x<0|y>=s(map).y|x>=s(map).x){return' ';}return Z[y].charAt(x);}static C s(String m){int x=m.split("\n")[0].length();int y=m.split("\n").length;return new C(x,y);}static C g(C d,char s){if(s=='/'){if(d.x==1&d.y==0){return new C(0,-1);}else if(d.x==-1&d.y==0){return new C(0,1);}else if(d.x==0&d.y==1){return new C(-1,0);}else if(d.x==0&d.y==-1){return new C(1,0);}}else if(s=='\\'){if(d.x==1&d.y==0){return new C(0,1);}else if(d.x==-1&d.y==0){return new C(0,-1);}else if(d.x==0&d.y==1){return new C(1,0);}else if(d.x==0&d.y==-1){return new C(-1,0);}}return null;}static class L{List<C> h=new ArrayList<>();C u;L(C from,C k){h.add(from);u=k;}void p(String m){if(get(m,h.get(0).x,h.get(0).y)!='@'){C q=new C(h.get(0).x+u.x,h.get(0).y+u.y);char n=get(m,q.x,q.y);if(n==' '){h.add(0,q);}else if(n=='/'){h.add(0,q);u=g(u,'/');}else if(n=='\\'){h.add(0,q);u=g(u,'\\');}else if('0'<=n&n<='9'){h.add(0,f(m,q,n));}else if(n=='@'){h.add(0,q);}}}C f(String m,C d,char n){for(int i=0;i<s(m).x;i++){for(int j=0;j<s(m).y;j++){if(get(m,i,j)==n&(i!=d.x|j!=d.y)){return new C(i,j);}}}return null;}}static class C{int x;int y;C y(C K){return new C(x-K.x,y-K.y);}C x(){return new C(-x,-y);}C(int F,int G){x=F;y=G;}public boolean equals(Object O){if(this==O)return 2>1;C M=(C)O;if(x!=M.x)return 1>2;if(y!=M.y)return 1>2;return 2>1;}}