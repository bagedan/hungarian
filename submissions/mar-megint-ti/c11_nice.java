static char[][]c,r;static int t,w,h;static void f(String s){t=0;int i,j;String[]p=s.split("\n");c=new char[p.length][0];for(i=0;i<p.length;i++){c[i]=(p[i]+"\n").toCharArray();t+=l(p[i]);}w=c[0].length;h=c.length;r=new char[h][w];for(i=0;i<h;i++){for(j=0;j<w;j++){if("v^<>".indexOf(c[i][j])!=-1){try{f(i,j,c[i][j]);}catch(RuntimeException e){if(e.getMessage()!=null){System.out.println(e.getMessage());return;}}finally{for(int k=0;k<h;k++){for(int l=0;l<w;l++){if(0!=r[k][l])r[k][l]='.';}}}}}}if(t==0)System.out.println(":D");else System.out.println(":(");}static int l(String s){return s.length()-s.replace("@", "").length();}static void f(int i,int j,char d){switch(d){case'>':g(i,j+1,'>');break;case'v':g(i+1,j,'v');break;case'^':g(i-1,j,'^');break;case'<':g(i,j-1,'<');break;}}static void g(int i,int j,char d){if(i<0||j<0||i>=h||j>=w)throw new RuntimeException();if("#v^<>".indexOf(c[i][j])!=-1)throw new RuntimeException();if('\\'==c[i][j])f(i,j,rd(d));if('/'==c[i][j])f(i,j,ru(d));if('0'<=c[i][j]&&c[i][j]<='9'){for(int k=0;k<h;k++){for(int l=0;l<w;l++){if(c[k][l]==c[i][j]&&(k!=i||j!=l))f(k,l,d);}}}if('@'==c[i][j]){t--;c[i][j]='#';throw new RuntimeException();}if('.'==r[i][j]){throw new RuntimeException(":/");}r[i][j]=d;f(i,j,d);}static char rd(char d){switch(d){case'>':return'v';case'v':return'>';case'^':return'<';case'<':return'^';default:return'X';}}static char ru(char d){switch(d){case'>':return'^';case'^':return'>';case'v':return'<';case'<':return'v';default:return'X';}}