static void f(int i){int c=c(i),t=c-i;if(t==0||t>1500)p("PAID BY CARD");else if(t%100!=0)p("KEEP THE CHANGE YOU FILTY ANIMAL");else p("HERE IS "+c);}static int c(int i){int x=500;if(i<x*4)return((i+99)/100)*100;else if(i>=x*4&&i<5000)return((i+499)/x)*x;else return((((int)(i*1.1))+250)/x)*x;}static void p(String s){System.out.print(s);}