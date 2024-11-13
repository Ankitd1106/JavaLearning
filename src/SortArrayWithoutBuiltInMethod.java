import java.util.Arrays;

public static void main(String[] args) {
    int[] arr = {2, 5, 3, 11};

    for (int i = 0; i < arr.length - 1; i++) { // Outer loop for number of passes
        for (int j = 0; j < arr.length - 1 - i; j++) { // Inner loop for each pass
            if (arr[j] > arr[j + 1]) { // If the current element is greater than the next
                // Swap the elements
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }
    }

    System.out.println(Arrays.toString(arr));

//    Arrays.sort(arr);
//    System.out.println(Arrays.toString(arr));

}
