	private static void f(String s){
		  int[] f=new int[256];

		  for (int p=s.length()-1;p>=0;--p)
		  {
		    char c=s.charAt(p);
		    ++f[c];
		  }
		  for (int i=1;i<=s.length();i++){
			  for (int j=0;j<256;j++)
			  {
				  if (f[j] == i) {
					  for (int k=0; k<f[j];k++)
						  System.out.print((char) j);
				  }
			  }
		  }
	}
