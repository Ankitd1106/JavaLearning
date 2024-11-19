public class methodOverloading {

    public static void method(String fname, String lname) {

        System.out.println("Concat =" + fname.concat(lname));
    }

    public static void method(int int1, int int2) {
        int sum = int1 + int2;
        System.out.println("Sum of the two numbers = " + sum);
    }

    public static void method(int int1, int int2, int int3) {
        int sum = int1 + int2 + int3;
        System.out.println("Sum of the three numbers = " + sum);
    }

    public static void method(int int1, int int2, String str) {
        int sum = int1 + int2;
        System.out.printf("Sum of the two numbers = %d and String given is %s", sum, str);
    }
}

public static void main(String[] args) {
    methodOverloading.method(1, 1);
}

