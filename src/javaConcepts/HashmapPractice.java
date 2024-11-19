import java.util.*;

public static void main(String[] args) {
    Map hm = new HashMap();
    hm.put("H", 44);
    hm.put("J", 1);
    hm.put("L", 4);
    hm.put("R", 22);

    HashMap<String, Integer> ageM = new HashMap<>();
    ageM.put("A", 1);
    ageM.put("B", 4);
    ageM.put("C", 44);
    ageM.put("D", 22);

    hm.putAll(ageM);
//    hm.remove("R");
    hm.putIfAbsent("Q", 22);

    LinkedHashMap<String, Integer> ageF = new LinkedHashMap<>();
    ageF.put("Y", 4);
    ageF.put("A", 1);
    ageF.put("B", 4);
    ageF.put("X", 4);

    System.out.println("hm = " + hm.entrySet());
    System.out.println("ageM = " + ageM.entrySet());
    System.out.println("ageF = " + ageF.entrySet());

    TreeMap<String, Integer> tm = new TreeMap<>();
    tm.put("zoi", 29);
    tm.put("abc", 9);
    tm.put("lkj", 30);
    tm.put("pqr", 19);

    System.out.println("tm = " + tm);
    System.out.println("tm keys = " + tm.keySet());
    System.out.println("tm values " + tm.values());

    for (Map.Entry<String, Integer> ele : tm.entrySet()) {
        System.out.println(ele.getKey() + " : " + ele.getValue());
    }




/*
    if (ageM.equals(ageF)){
        System.out.println("equals");
        System.out.println(ageM.equals(ageF));
    }
   else {
        HashMap<String, Integer> diff1 = new HashMap<>(ageM);
        System.out.println("difference removed = "+diff1.entrySet().removeAll(ageF.entrySet()));
        System.out.println("present in ageM but not in ageF = "+diff1);

        HashMap<String, Integer> diff2 = new HashMap<>(ageF);
        System.out.println("difference removed = "+diff2.entrySet().removeAll(ageM.entrySet()));
        System.out.println("present in ageF but not in ageM = "+diff2);
    }
    */
}
