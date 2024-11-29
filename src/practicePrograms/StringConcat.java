package practicePrograms;

public class StringConcat {
    public static void main(String[] args) {
        String input = "aaabbbacfwww";
        StringBuilder result = new StringBuilder();
//        int count = 1;

        for (int i = 0; i < input.length(); i++) {
            int count = 1;
            // Append the current character
            result.append(input.charAt(i));

            // Count consecutive characters
            while (i + 1 < input.length() && input.charAt(i) == input.charAt(i + 1)) {
                count++;
                i++;
            }

            // Append the count if greater than 1
            if (count > 1) {
                result.append(count);
            }

            // Reset count
//            count = 1;
        }

        System.out.println("Output: " + result);

    }

}
