public static void main(String[] args) {
    int number = 5; // Change this number to check other numbers

    if (isPrime(number)) {
        System.out.println(number + " is a prime number.");
    } else {
        System.out.println(number + " is not a prime number.");
    }
}

public static boolean isPrime(int num) {
    if (num <= 1) return false; // Numbers less than or equal to 1 are not prime

    for (int i = 2; i <= num / 2; i++) { // Check divisibility only up to half of the number
        if (num % i == 0) return false; // If divisible, it's not prime
    }

    return true; // Number is prime if no divisors are found
}
