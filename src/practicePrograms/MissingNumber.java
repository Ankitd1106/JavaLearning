package practicePrograms;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr = new int[99];
        int missingNumber = 45;
        int index = 0;

        for (int i = 1; i <= 100; i++) {
            if (i != missingNumber) {
                arr[index] = i;
                index++;
            }
        }
        System.out.println(Arrays.toString(arr));

        int expectedSum = ((arr.length + 1) * ((arr.length + 1) + 1)) / 2;
        int actualSum = 0;

        for (int num : arr) {
            actualSum = actualSum + num;
        }

        System.out.println("missing number = " + (expectedSum - actualSum));
    }


}
