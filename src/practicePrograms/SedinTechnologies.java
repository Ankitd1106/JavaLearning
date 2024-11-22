package practicePrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class SedinTechnologies {
    public static void main(String[] args) {
        //input - interview
        //output - i =2, n=1, t=1, ...

        String in = "interview";

        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : in.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }

        System.out.println(map);
    }
}
