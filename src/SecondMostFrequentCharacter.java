import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public static void main(String[] args) {
    String s = "DevLabsAlliance";

    Map<Character,Integer> map = new HashMap<>();

    for (char c : s.toLowerCase().toCharArray()){
        if(map.containsKey(c)) {
            map.replace(c,map.get(c)+1);
        }
        else {
            map.put(c,1);
        }
    }
    List<Map.Entry<Character,Integer>> list = new ArrayList<>(map.entrySet());
    list.sort(Map.Entry.comparingByValue());
    System.out.println(list.get(list.size()-2));






}
