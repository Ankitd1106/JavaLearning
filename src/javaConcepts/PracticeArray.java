package javaConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PracticeArray {
    public static void main(String[] args) {
        int[] arr = new int[5];
        arr[0] = 10;
        arr[1] = 111;
        arr[2] = 56;
        arr[3] = 4;
        arr[4] = 5;

        System.out.println("Array : "+Arrays.toString(arr));

        Arrays.sort(arr);
        System.out.println("Sorted array : "+Arrays.toString(arr));

        List<Integer> list = new ArrayList<>();

        for (int i : arr){
            list.add(i);
        }

        list.add(2,44);

        System.out.println("List : "+list);

        Collections.sort(list);
        System.out.println("Sorted List : "+list);
    }


}
