public static void main(String[] args) {

    for (int i = 1; i <= 100; i++) {
        if (i % 3 == 0 && i % 5 == 0) {
            System.out.println("Div by 3 and 5 Fizz-Buzz");
        } else if (i % 5 == 0) {
            System.out.println("Div by 5 - Buzz");
        } else if (i % 3 == 0) {
            System.out.println("Div by 3 - Fizz");
        } else {
            System.out.println(i);
        }
    }


}
