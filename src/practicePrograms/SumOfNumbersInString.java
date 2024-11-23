package practicePrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNumbersInString {

    public static int sumOfNumbers(String str) {
        if (str == null || str.isEmpty()) {
            return 0;
        }

        // Use regex to find numbers
        Pattern pattern = Pattern.compile("-?\\d+");
        Matcher matcher = pattern.matcher(str);

        int sum = 0;

        // Find all numbers and add them to the sum
        while (matcher.find()) {
            sum = sum + Integer.parseInt(matcher.group());
        }

        return sum;
    }

    public static void main(String[] args) {
        String str = "1abc2cde23fhk";
        int sum = sumOfNumbers(str);
        System.out.println("Sum of numbers: " + sum);
    }
}
