static void f(int c){int t=0;if(c<2000){t=(((c-1)/100)+1)*100;}else if(c<5000) {t=(((c-1)/500)+1)*500;}else{t=((((int)(c*1.1)-250)/500)+1)*500;}int g=t-c;if (g==0||g>1500) {System.out.print("PAID BY CARD");}else if(g%100!=0){System.out.print("KEEP THE CHANGE YOU FILTY ANIMAL");}else{System.out.print("HERE IS "+t);}}
