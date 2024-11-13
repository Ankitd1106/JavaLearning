import java.util.*;

public static void main(String[] args) {
    String str = "programming";

    List<Character> duplicates = new ArrayList<>();
    Set<Character> set = new LinkedHashSet<>();

    for (char c : str.toCharArray()) {
        if (duplicates.contains(c)) {
            set.add(c);
        } else {
            duplicates.add(c);
        }
    }
    System.out.println("Duplicate characters in " + str + " = " + set);
}
