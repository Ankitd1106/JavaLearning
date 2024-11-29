package practicePrograms;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SumOfNumbersInString {

    public static void main(String[] args) {
        String str = "1abc2cde230fhk";
        int sum = 0;

        if (str != null || !str.isEmpty()) {
            Pattern pattern = Pattern.compile("-?\\d+");
            Matcher matcher = pattern.matcher(str);

            while (matcher.find()) {
                sum = sum + Integer.parseInt(matcher.group());
            }
        }

        System.out.println("Sum of numbers: " + sum);
    }
}
