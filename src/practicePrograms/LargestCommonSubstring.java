public static void main(String[] args) {
    String string1 = "ankit";
    String string2 = "ankhoperankitghaiheanktuafw";

    int maxLength = 0;
    String largestSubstring = "";

    // Iterate through all substrings of string1
    for (int i = 0; i < string1.length(); i++) {
        for (int j = i + 1; j <= string1.length(); j++) {
            String substring = string1.substring(i, j);

            // Check if substring exists in string2
            if (string2.contains(substring) && substring.length() > maxLength) {
                maxLength = substring.length();
                largestSubstring = substring;
            }
        }
    }
    System.out.println("Largest common substring: " + largestSubstring);
}
