import java.util.*;
import java.util.stream.Collectors;

public class C2 {

    public static void main(String args[]) {
        f("wqfdSREA3321");
    }

    private static void f(String w) {
        String[] r = {"`1234567890-=~!@#$%^&*()_+", "qwertyuiop[]\\QWERTYUIOP{}|", "asdfghjkl;'ASDFGHJKL:\"", "zxcvbnm,./ZXCVBNM<>?"};
        List<Map<Character, Integer>> m = new ArrayList<>();
        for (int i = 0; i < 4; i++) m.add(i, new HashMap<>());
        for (char x : w.toCharArray())
            for (int i = 0; i < 4; i++)
                if (r[i].indexOf(x) > -1) m.get(i).put(x, m.get(i).get(x) != null ? m.get(i).get(x) + 1 : 1);
        List<Map<Character, Integer>> l = m.stream().sorted((a, b) -> a.values().stream().mapToInt(Number::intValue).sum() - b.values().stream().mapToInt(Number::intValue).sum()).filter(x -> !x.keySet().isEmpty()).collect(Collectors.toList());
        if (l.size() > 1 && l.get(0).values().stream().mapToInt(Number::intValue).sum() == l.get(1).values().stream().mapToInt(Number::intValue).sum()&&l.get(0).size()!=l.get(1).size())
            l = l.stream().sorted((a, b) -> Collections.frequency(a.values(), 1) - Collections.frequency(b.values(), 1)).collect(Collectors.toList());
        if (l.size() > 1 && l.get(0).values().stream().mapToInt(Number::intValue).sum() == l.get(1).values().stream().mapToInt(Number::intValue).sum() && Collections.frequency(l.get(0).values(), 1) != Collections.frequency(l.get(1).values(), 1))
            l = l.stream().filter(a -> Collections.frequency(a.values(), 1) > 0).limit(2).sorted((a, b) -> Collections.frequency(a.values(), 1) - Collections.frequency(b.values(), 1)).collect(Collectors.toList());
        w = "";
        for (String s : r) for (Character x : s.toCharArray()) if (l.get(0).keySet().contains(x)) w += x;
        System.out.println(w);
    }
}
