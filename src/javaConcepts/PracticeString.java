package javaConcepts;

public class PracticeString {
    public static void main(String[] args) {
        String s = "abc qwe";

        s.length();
        s.charAt(3);

        System.out.println(s.concat(" poi"));
//        String sq = s.substring(0,2);
//        String sq = s.substring(2);
//        System.out.println(sq);
        StringBuilder str = new StringBuilder(s);
    }

}
