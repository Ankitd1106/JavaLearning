import java.util.*;

public static void main(String[] args) {
    Set<String> set = new TreeSet<>();
    set.add("India");
    set.add("Usa");
    set.add("Japan");
    set.add("Apple");
    set.add("Banana");

    System.out.println(set);

//    Iterator<String> i = set.iterator();
//
//    while(i.hasNext()){
//        System.out.println(i.next());
//    }
//
//    List<String> fruits = new ArrayList<>();
//    fruits.add("Banana");
//    fruits.add("japan");
//    fruits.add("usa");

//    System.out.println(set.containsAll(fruits));
//    System.out.println(set);
//    System.out.println("after removing fruits from set= "+set.removeAll(fruits)+" "+set);
//    System.out.println("fruits is empty ="+ fruits.isEmpty());

//    union
//    set.addAll(fruits);
//    System.out.println("set = "+set);

//    intersection
//    set.retainAll(fruits);
//    System.out.println("set = "+set);

//    difference
//    set.removeAll(fruits);
//    System.out.println("set = " + set);


}
