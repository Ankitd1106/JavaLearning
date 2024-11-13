import java.util.HashMap;
import java.util.Map;

public static void main(String[] args) {
    String s = "aabbcaaaaaaaccccccccccpieuyioyeqpowujdpazmowduhaiofyoweufmaoppmwefuqemyromqYOQHEf";
    char ch = 'o';

    HashMap<Character, Integer> map = new HashMap<>();

    for (char c : s.toLowerCase().toCharArray()) {
        if (map.containsKey(c)) {
            map.replace(c,map.get(c)+1);
        } else {
            map.put(c, 1);
        }
    }

    System.out.println(map);

    for (Map.Entry entry : map.entrySet()){
        System.out.println("Frequency of "+entry.getKey()+" is "+entry.getValue());
    }
}
