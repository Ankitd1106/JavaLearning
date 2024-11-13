import java.util.HashMap;

public static boolean isAnagram(String st1, String st2) {
    String s1 = st1.toLowerCase().replace(" ", "");
    String s2 = st2.toLowerCase().replace(" ", "");

    char[] s1Char = s1.toCharArray();
    char[] s2Char = s2.toCharArray();

    if (s1Char.length == s2Char.length) {
        HashMap<Character, Integer> s1Map = new HashMap<>();
        HashMap<Character, Integer> s2Map = new HashMap<>();


        for (char ch : s1Char) {
            if (!s1Map.containsKey(ch)) {
                s1Map.put(ch, 1);
            } else if (s1Map.containsKey(ch)) {
                s1Map.replace(ch, s1Map.get(ch) + 1);
            }
        }
        for (char ch : s2Char) {
            if (!s2Map.containsKey(ch)) {
                s2Map.put(ch, 1);
            } else if (s2Map.containsKey(ch)) {
                s2Map.replace(ch, s2Map.get(ch) + 1);
            }
        }


        if (s1Map.equals(s2Map)) {
            System.out.println(s1 + " and " + s2 + " are anagrams");
            return true;
        } else {
            System.out.println(s1 + " and " + s2 + " are not anagrams");
            return false;
        }

    } else {
        System.out.println("unequal lengths - not anagrams");
        return false;

    }
}

public static void main(String[] args) {
    String s1 = "Dormitory";
    String s2 = "Dirty room";
    isAnagram(s1, s2);
}
