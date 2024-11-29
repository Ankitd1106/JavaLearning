package javaConcepts;

public class StringTest {
    public static void main(String[] args) {

        String a = "Ravi";
        a = a + "Ankit";

        System.out.println(a);

        String s1 = "Hello";
        String s2 = s1;
        s1 = s1.concat(" World");

        System.out.println(s1); // Prints: Hello World
        System.out.println(s2); // Prints: Hello
    }
}
