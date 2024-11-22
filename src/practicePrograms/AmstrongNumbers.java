package practicePrograms;

public class AmstrongNumbers {
    public static void main(String[] args) {

        int num = 9474;
        int sum = 0;

        int numberOfDigits = String.valueOf(num).length();

        char[] nums = String.valueOf(num).toCharArray();

        for (char c : nums) {
            int digit = Integer.parseInt(String.valueOf(c));
            sum = sum + (int) Math.pow(digit, numberOfDigits);
        }

        if (num == sum)
            System.out.println(num + " is an amstroing number");

        else
            System.out.println(num + " is a not an amstroing number");
    }

}
