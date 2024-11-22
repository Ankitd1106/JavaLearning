public static void main(String[] args) {
    System.out.println(processInput("anki5[t]")); // Output: ankitt
    System.out.println(processInput("ank2[it3[p]]")); // Output: ankitit
}

public static String processInput(String input) {
    StringBuilder result = new StringBuilder();
    int i = 0;

    while (i < input.length()) {
        char ch = input.charAt(i);

        if (Character.isDigit(ch)) {
            int repeatCount = Character.getNumericValue(ch);
            i++; // Move to the next character after the digit

            if (i < input.length() && input.charAt(i) == '[') {
                int closingBracket = input.indexOf(']', i);
                if (closingBracket != -1) {
                    String repeatSegment = input.substring(i + 1, closingBracket);
                    result.append(repeatSegment.repeat(repeatCount));
                    i = closingBracket; // Move to the closing bracket
                }
            }
        } else {
            result.append(ch);
        }
        i++;
    }
    return result.toString();
}

