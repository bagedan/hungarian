static void f(String s){int v=Integer.MAX_VALUE;String p=new String("`1234567890-=~!@#$%^&*()_+");String o=new String("qwertyuiop[]\\QWERTYUIOP{}|");String u=new String("asdfghjkl;'ASDFGHJKL:\"");String b=new String("zxcvbnm,./ZXCVBNM<>?");List<String> l=Arrays.asList(p,o,u,b);int[] y={0,0,0,0};String x="";String c="";String r="";String h="";for(char q:s.toCharArray()){String a=String.valueOf(q);if(p.contains(a)){y[0]++;if(!x.contains(a))x+=a;}if(o.contains(a)){y[1]++;if(!c.contains(a))c+=a;}if(u.contains(a)){y[2]++;if(!r.contains(a))r+=a;}if(b.contains(a)){y[3]++;if(!h.contains(a))h+=a;}}List<String> n=Arrays.asList(x,c,r,h);Map<Integer,Integer> j=new HashMap<>();int m=v;for(int i=0;i<4;i++){if(y[i]>0&&y[i]<=m){if(y[i]!=m){j.clear();}j.put(i,n.get(i).length());m=y[i];}}int t=v;int k=0;for(Entry<Integer,Integer> e:j.entrySet()){if(e.getValue()<t){t=e.getValue();k=e.getKey();}}for(char q:l.get(k).toCharArray()){String a=String.valueOf(q);if(n.get(k).contains(a))System.out.print(a);}}