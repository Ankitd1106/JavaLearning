import java.util.regex.*;

public class SumOfNumbersInString {
    public static void sum() {
        String str = "1abc2cde23fhk";
        int sum = sumOfNumbers(str);
        System.out.println("Sum of numbers: " + sum);
    }

    public static int sumOfNumbers(String str) {
        // Use regex to find numbers
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(str);

        int sum = 0;

        // Find all numbers and add them to the sum
        while (matcher.find()) {
            sum += Integer.parseInt(matcher.group());
        }

        return sum;
    }

    public static void main(String[] args) {
        new SumOfNumbersInString();
    }
}
