void f(char*s){char a[128]="";int i,j,k;for(i=0;i<strlen(s);a[s[i]]++,i++);for(i=1;i<99;i++)for(j=0;j<128;j++)if(a[j]==i)for(k=0;k<a[j];putchar(j),k++);}