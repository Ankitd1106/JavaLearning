public static void main(String[] args) {
    String str = "My Name is Ankit";

    String[] words = str.split(" ");

    StringBuilder rev = new StringBuilder();

    for (int i = words.length-1;i>=0;i--){
        rev.append(words[i]).append(" ");
    }

    System.out.println(rev.toString().trim());
}
