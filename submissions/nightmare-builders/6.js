function f(t){Z=100;q=500;r=t<2e3?Math.ceil(t/Z)*Z:t<5e3?Math.ceil(t/q)*q:Math.round(Math.trunc(t*1.1)/q)*q;console.log(r-t>1500||!(t-r)?"PAID BY CARD":(r-t)%Z>0?"KEEP THE CHANGE YOU FILTY ANIMAL":"HERE IS "+r)}