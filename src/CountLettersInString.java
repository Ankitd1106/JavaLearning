import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public static void main(String[] args) {
    String s = "tomato";

    HashMap<Character, Integer> map = new LinkedHashMap<>();

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
