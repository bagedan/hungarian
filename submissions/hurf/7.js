function f(o,l){for(f=o.split("\n"),f.length>4&&f.splice(f.length-4,0,""),w=[],r=[],h=f.length,i=0;i<h;++i){for(w[i]=[],j=0;j<h;++j)w[i][j]=0;r[i]=0}for(i=0;i<h;++i)for(a=f[i].split("|"),j=0;j<a.length;++j)t=a[j].split(":"),w[h-i-1][t[1]]=parseInt(t[0]);for(d=0,u=!0,v=0,x=0;;){if(v-=r[d],r[d]=0,0==d)u=!0;else if(d==h-1)u=!1;else if(0==v){for(k=!1,i=u?d+1:d-1;i<h&&i>=0;u?++i:--i)w[d][i]>0&&(k=!0);k||(u=!u)}for(i=u?d+1:d-1;i<h&&i>=0;u?++i:--i)r[i]+=w[d][i],v+=w[d][i],w[d][i]=0;if(v>=l)return void console.log("polite after "+x+" stops at "+d+" floor");if(0==v)return void console.log("lonely after "+x+" stops at "+d+" floor");for(u?d++:d--;d<h&&d>=0&&!(r[d]>0);u?++d:--d);++x}}