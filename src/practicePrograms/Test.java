package practicePrograms;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class Test {
    public static void main(String[] args) {
        //string s = "My name Is Ankit Das"

        String s = "My name Is Ankit Das";
        char[] strChars = s.toLowerCase().replace(" ", "").toCharArray();

        HashMap<Character, Integer> map = new LinkedHashMap<>();

        for (char c : strChars){
//            if (map.containsKey(c)){
//                map.replace(c,map.get(c),map.get(c)+1);
//            }
//
//            else {
//                map.put(c,1);
//            }

            map.compute(c, (key, val) -> (val == null) ? 1 : val + 1);
        }

        System.out.println(map);

    }
}
