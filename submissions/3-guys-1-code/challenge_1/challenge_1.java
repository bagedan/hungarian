static void f(String s){char[]a=s.toCharArray();Map<Character,String>b=new HashMap<>();for(char c:a){if(b.containsKey(c))b.put(c,b.get(c)+c);else b.put(c,""+c);}b.entrySet().stream().sorted(((Comparator<Map.Entry<Character,String>>)(e,f)->e.getValue().length()-f.getValue().length()).thenComparing((e,f)->(int)e.getKey()-(int)f.getKey())).forEach(entry->System.out.print(entry.getValue()));}