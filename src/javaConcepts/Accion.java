package javaConcepts;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Accion {
    public static void main(String[] args) {
        String s = "abcdadeeab";

        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.replace(c, map.get(c) + 1);
            } else {
                map.put(c, 1);
            }
        }
        System.out.println("occurance of each attibute = " + map);

//        for (Map.Entry entry : map.entrySet()) {
//            System.out.println("occurance of " + entry.getKey() + " is " + entry.getValue());
//            System.out.println(entry.getKey() + " occurs " + entry.getValue() + " times ");
//        }
    }
}
