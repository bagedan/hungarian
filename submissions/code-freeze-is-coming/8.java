static void f(String q,int n,int w){int e=0;for(int i=0;i<q.length();i+=w){e++;}int r=e%n>0?(e/n)+1:(e/n);String[][]t=new String[r][n];int z=0;String u="";for(int i=0;i<n;i++){for(int j=0;j<r;j++){int o=z+w>q.length()?q.length():z+w;t[j][i]=q.substring(z,o);if(t[j][i].length()<w){String p=t[j][i];for(int k=0;k<w-t[j][i].length();k++){p+=" ";}t[j][i]=p;}t[j][i]+="|";z=o;if(i ==n-1){String a=t[j][i].replace("|","");t[j][i]=a+"\n";}}}for(int i=0;i<r;i++){for(int j=0;j<n;j++){u+=t[i][j];}}System.out.println(u);}