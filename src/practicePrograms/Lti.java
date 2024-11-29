package practicePrograms;

import java.util.*;

public class Lti {

    public static void main(String[] args) {
        String[] metro = {"Mumbai", "Delhi", "Chennai", "Kolkata"};  //metro

        Map<String, String> cityMap1 = new HashMap<>();
        cityMap1.put("Bangalore", "080");
        cityMap1.put("Mumbai", "021");

        Map<String, String> cityMap2 = new HashMap<>();
        cityMap2.put("Delhi", "010");
        cityMap2.put("Mysore", "0821");

        List<Map<String, String>> lst = new LinkedList<>();
        lst.add(cityMap1);
        lst.add(cityMap2);

//      System.out.println(lst);

        for (Map<String, String> city : lst) {
            Iterator<Map.Entry<String, String>> iterator = city.entrySet().iterator();
            while (iterator.hasNext()) {
                Map.Entry<String, String> entry = iterator.next();
                String c = entry.getKey();
                // If the c is not a metro c, remove it
                if (!Arrays.asList(metro).contains(c)) {
                    iterator.remove();
                }
            }
        }
        System.out.println("final lst = " + lst); // Should print only metro cities (Mumbai, Delhi)
    }
}
