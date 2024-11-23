public static void main(String[] args) {
    String s = "Ankit";
//    StringBuilder strb = new StringBuilder(s);
//    System.out.println(strb.reverse());

    char[] sChar = s.toCharArray();

    StringBuilder sb = new StringBuilder();

    for (int i = sChar.length - 1; i >= 0; i--) {
        sb.append(sChar[i]);
    }

    System.out.println("Reversed string is = " + sb);

}