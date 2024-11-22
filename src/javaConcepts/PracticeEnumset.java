package javaConcepts;

import java.util.EnumSet;
import java.util.Set;

enum Gfg {CODE, LEARN, CONTRIBUTE, QUIZ, MCQ}
enum names {ANKIT, ANIL, ROBERT, SUNIL, KARTIK}

public class PracticeEnumset {

    public static void main(String[] args) {
        // Creating sets
        Set<Gfg> set1;
        Set<names> set2;
        Set<names> set3;
        Set<names> set4;

        // Adding the elements
        set1 = EnumSet.of(Gfg.QUIZ, Gfg.CONTRIBUTE, Gfg.LEARN, Gfg.CODE, Gfg.MCQ);
        set2 = EnumSet.allOf(names.class);
        set3 = EnumSet.complementOf(EnumSet.of(names.SUNIL));

        set4 = EnumSet.range(names.ANIL, names.KARTIK);

        System.out.println("Set 1: " + set1);
        System.out.println("Set 2: " + set2);
        System.out.println("Set 3: " + set3);
        System.out.println("Set 4: " + set4);
    }
}
