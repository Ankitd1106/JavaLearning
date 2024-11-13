public static void main(String[] args) {
    String s = "a2e10n3";
    StringBuilder result = new StringBuilder();

    for (int i = 0; i < s.length(); ) {
        char character = s.charAt(i);
        i++;

        // Initialize count as a string to handle multi-digit numbers
        StringBuilder countStr = new StringBuilder();
        while (i < s.length() && Character.isDigit(s.charAt(i))) {
            countStr.append(s.charAt(i));
            i++;
        }

        // Convert countStr to an integer
        int count = Integer.parseInt(countStr.toString());

        // Append the character 'count' times
        result.append(String.valueOf(character).repeat(count)).append(" ");
    }

    System.out.println(result.toString().trim());

}

