public static void f(String i){Map<Character,Integer> m=new HashMap<>();for(int j=0;j<i.length();j++){Integer c=m.get(i.charAt(j));m.put(i.charAt(j),c==null ? 1 : c+1);}m.entrySet().stream().sorted((o1, o2) -> {int c=o1.getValue().compareTo(o2.getValue());if (c==0){c=o1.getKey().compareTo(o2.getKey());}return c;}).forEach(characterIntegerEntry -> {for (int k=0;k<characterIntegerEntry.getValue();k++)System.out.print(characterIntegerEntry.getKey());});}