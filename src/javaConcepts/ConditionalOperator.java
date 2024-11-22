package javaConcepts;

public class ConditionalOperator {
    public static void main(String[] args) {
        int a = 10;
        int b = 50;
        int c = 200;

        int max2 = (a > b) ? a : b;
        System.out.println("max of a & b = " + max2);

        int max3 = (a > b) ? (a > c ? a : c) : (b > c ? b : c);

        System.out.println("max of a, b, c = " + max3);
    }
}
