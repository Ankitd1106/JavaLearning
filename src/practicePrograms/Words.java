package practicePrograms;

import java.util.HashMap;

public class Words {
    public static void main(String[] args) {
        String s = "Engineer";

        char[] charS = s.toLowerCase().toCharArray();

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : charS) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);
    }
}
