		static String a="1",b="2",c="3",d="4",e="5",f="6",g="7",h="8",j="9",t;
		private static void f(String s) {
			for (int i=5;i<=s.length();i++){
				t=s.substring(0,i);
				String o=t.replaceAll("(.).", "$1"),x=t.replaceAll(".(.)", "$1");
				if (t.length()%2==1)
					x=x.substring(0, x.length()-1);
				if(g(o,"O")||g(x,"X"))
					return;
			}
			System.out.println("?");
		}
		static boolean g(String s, String p) {
			if (h(s,a)&&(h(s,b)&&h(s,c)||h(s,d)&&h(s,g)||h(s,e)&&h(s,j))||h(s,b)&&h(s,e)&&h(s,h)||h(s,c)&&h(s,f)&&h(s,j)||h(s,d)&&h(s,e)&&h(s,f)||h(s,g)&&h(s,h)&&h(s,j)||h(s,c)&&h(s,e)&&h(s,g)){
				System.out.println(p);
				return true;
			}
			return false;
		}
		static boolean h(String s, String m) {
			return s.contains(m);
		}
