static void f(int n,String f){char[] c=f.toCharArray();List<Integer> p=new ArrayList<>();long s,a,b,x=0,y=0;int i,j,o=f.length(),r=f.split("\n").length,m=o%r,h=o/r+(m>0?1:0),t=r*h-h;String e=f.substring(t);for(i=0;i<e.length();i++){if(e.charAt(i)=='X'){b=0;a=0;v:for(j=r-2;j>=0;j--){switch(c[j*h+i]){case'\\':a++;if(a>1)a=9;b++;break;case'/':a--;if(a<-1)a=9;b++;break;case '|':b++;break;case '$':if(a==0&&b>0)x+=1;break v;case '.':if(a==0&&b>0){y+=1;p.add(j*h+i);}break v;default:break v;}}}}s=y+x;if(s==0){System.out.println(":(");}else if(s<n){System.out.println(n-s);}else if(x>n){System.out.println(n-x);}else{if(x<n)for(int pos:p){c[pos]='$';if(++x==n)break;}System.out.println(c);}}