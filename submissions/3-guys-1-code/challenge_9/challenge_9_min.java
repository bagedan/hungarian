static void f(String x){System.out.println(k(x));}static String k(String b){M m=new M();for(String s:Arrays.asList(b.replaceAll("\\s+"," ").trim().split(" "))){if(s.equals("goomba")||s.equals("koopa")||s.equals("piranha")){if(!m.h())return"GAME OVER";}else if(s.equals("Bowser")||s.equals("Princess"))return "WIN";else if(s.equals("Mushroom"))m.m();else if (s.equals("1Up"))m.h(100);else if(s.equals("Star"))m.i=2;else try{m.h(Integer.parseInt(s.trim()));}catch(Exception ex){return"???";}}return"???";}static class M{int c;boolean s;int i;M(){c=300;s=false;i=0;}boolean h(){if(i==0){if(s){s=false;}else c-=100;}i();return c >= 100;}void h(int h){c+=h;i();}void m(){s=true;i();} void i(){if(i> 0)i-=1;}}