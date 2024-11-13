import java.util.LinkedHashSet;
import java.util.Set;

public static String removeDuplicateCharacters(String input) {
    Set<Character> uniqueChars = new LinkedHashSet<>();
    for (char c : input.toCharArray()) {
        uniqueChars.add(c);
    }
    StringBuilder result = new StringBuilder();
    for (char c : uniqueChars) {
        result.append(c);
    }
    return result.toString();
}

public static void main(String[] args) {
//    Scanner scanner = new Scanner(System.in);
//    System.out.print("Enter a string: ");
    String input = "Jaava";
//    scanner.close();

    String result = removeDuplicateCharacters(input);
    System.out.println("String after removing duplicates: " + result);
}
