package practicePrograms;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Test2 {
//    public static void main(String[] args) {
//
////    {2,3,5,1,0,7,2};
////    {1,0,2,2}
//
//        int[] arr = {2, 3, 5, 1, 7, 2, 2, 2};
//
//        Arrays.sort(arr);
//
//        List<Integer> list = new LinkedList<>();
//
//        int count0 = 0;
//        int count1 = 0;
//        int count2 = 0;
//
//        for (int a : arr) {
//            if (a == 0) {
//                count0 = count0 + 1;
//            } else if (a == 1) {
//                count1 = count1 + 1;
//            } else if (a == 2) {
//                count2 = count2 + 1;
//            }
//        }
//
//        for (int one = 1; one <= count1; one++) {
//            list.add(1);
//        }
//
//        for (int zero = 1; zero <= count0; zero++) {
//            list.add(0);
//        }
//
//        for (int two = 1; two <= count2; two++) {
//            list.add(2);
//        }
//
//        System.out.println(list);
//
//    }

    //Alternate approach
    public static void main(String[] args) {
        //    {2,3,5,1,0,7,2};
        //    {1,0,2,2}

        int[] arr = {2, 3, 5, 1, 7, 2, 2, 2, 0, 0, 1, 0};

        List<Integer> l0 = new ArrayList<>();
        List<Integer> l1 = new LinkedList<>();
        List<Integer> l2 = new ArrayList<>();

        for (int i : arr) {
            if (i == 0) {
                l0.add(i);
            } else if (i == 1) {
                l1.add(i);
            } else if (i == 2) {
                l2.add(i);
            }
        }

        l1.addAll(l0);
        l1.addAll(l2);

        System.out.println(l1);
    }
}
