private static void f(){Map<String,List<Integer>>m=new HashMap<>();m.put("Ghostbusters",Arrays.asList(1,5,9,17,21,27,31,39,44,54,59,62,65,68,71,75,78,81,84,87));m.put("If there's something strange",Arrays.asList(2));m.put("In you neighborhood",Arrays.asList(3));m.put("Who you gonna call",Arrays.asList(4,8,20,26));m.put("If there's something weird",Arrays.asList(6));m.put("And it don't look good",Arrays.asList(7));m.put("I ain't afraid of no ghost",Arrays.asList(11,12,23,24,33,35,49,50));m.put("If you're seeing things",Arrays.asList(14));m.put("Running through your head",Arrays.asList(15));m.put("Who can you call",Arrays.asList(16));m.put("An invisible man",Arrays.asList(18));m.put("Sleeping in your bed",Arrays.asList(19));m.put("If you're all alone",Arrays.asList(28));m.put("Pick up the phone",Arrays.asList(29));m.put("And call",Arrays.asList(30));m.put("I here it likes the girls",Arrays.asList(34));m.put("Yeah yeah yeah yeah",Arrays.asList(36));m.put("Who ya gonna call",Arrays.asList(38,61,64,70,74,80,86));m.put("If you've had a dose of a",Arrays.asList(41));m.put("Freaky ghost baby",Arrays.asList(42));m.put("You better call",Arrays.asList(43));m.put("Lemme tell ya something",Arrays.asList(46));m.put("Bustin' makes me feel good",Arrays.asList(47));m.put("Don't get caught alone no no",Arrays.asList(52));m.put("When it comes through your door",Arrays.asList(56));m.put("Unless you just want some more",Arrays.asList(57));m.put("I think you better call",Arrays.asList(58,67));m.put("I can't hear you",Arrays.asList(73));m.put("Louder",Arrays.asList(77));m.put("\n",Arrays.asList(10,13,22,25,32,37,40,45,48,51,53,55,60,63,66,69,72,76,79,82,85));for(int i=1;i<88;i++){for(String key:m.keySet()){if(m.get(key).contains(i)){System.out.println(key);}}}}