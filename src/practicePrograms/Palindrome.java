public static Boolean isPalindrome(String s) {

    int left = 0;
    int right = s.length()-1;

    while (left < right) {
        if (s.charAt(left) != s.charAt(right)) {
            return false;
        }
        left++;
        right--;
    }

    return true;
}

public static void main(String[] args) {
//    String str = "tab a cat";
    String str = "Was it a car or a cat I saw?";
    String s = str.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
    System.out.println(s);

    System.out.println(str+" - is palindrome? = "+isPalindrome(s));
}
