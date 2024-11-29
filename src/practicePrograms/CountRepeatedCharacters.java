package practicePrograms;

import java.util.HashMap;
import java.util.Map;

public class CountRepeatedCharacters {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();
        String s = "programminggggggggggrrr";

        for (char c : s.toLowerCase().toCharArray()) {
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " is occuring " + entry.getValue() + " times");
            }
        }
    }
}
