static void f(int n,String s){String[] r=s.split("\\n");int t[]=new int[r[r.length-1].length()],i,j,z=0,l=0;for(j=0; j<t.length;j++){t[j]=0;if(r[r.length-1].charAt(j)!='X'){t[j]=-1;}}for(i=r.length-2;i>=0;i--){for(j=0;j<t.length;j++){if(r[i].length()>j){if(t[j]!=-1&t[j]!=1&t[j]!=2){if(r[i].charAt(j)=='\\'&(t[j]==+3|t[j]==0))t[j]-=3;else if(r[i].charAt(j)=='/'&(t[j]==-3|t[j]==0)){t[j]+=3;}else if(r[i].charAt(j)=='|'){}else if(r[i].charAt(j)=='.'&t[j]==0){t[j]=1;}else if(r[i].charAt(j)=='$'&t[j]==0){t[j]=2;}else t[j]=-1;}}}}for(j=0;j<t.length;j++){if(t[j]==1)z++;if(t[j]==2)l++;}if(z==0&l==0)System.out.print(":(");else if(z+l<n)System.out.print(n-z-l);else if(l>n)System.out.print(n-l);else if(z+l>=n){for(j=0;j<t.length;j++){if(t[j]==1&l<n)for(i=0;i<r.length;i++)if(r[i].charAt(j)=='.'){r[i]=r[i].substring(0,j)+"$"+r[i].substring(j+1);l++;}}for(i=0;i<r.length;i++)System.out.println(r[i]);}}