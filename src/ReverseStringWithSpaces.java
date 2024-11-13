public static void main(String[] args) {
    String s = "The quick brown fox jumped over the lazy dog";
    //o/p = "yM eman si tiknA"

    String[] words = s.split(" ");
    StringBuilder reversedString = new StringBuilder();

    for (String word : words){
        StringBuilder reversedWord = new StringBuilder(word);
        reversedString.append(reversedWord.reverse()).append(" ");
    }

    System.out.println(reversedString.toString().trim());
}
