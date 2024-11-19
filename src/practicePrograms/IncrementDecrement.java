public static void main(String[] args) {
    int x = 5;
    int y = 10;

    x = x++ + ++y;
    y = --y + x--;

    System.out.println("x = " + x);
    System.out.println("y = " + y);
}
