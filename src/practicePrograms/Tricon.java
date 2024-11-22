import java.util.ArrayList;
import java.util.List;

//I/p = Input - [1,2,3] input2 [3,1,2] output [5,3,4]

public static void main(String[] args) {
    int[] arr1 = {1, 2, 3};
    int[] arr2 = {3, 1, 2};

    List<Integer> op = new ArrayList<>();

    for (int i = arr1.length - 1; i >= 0; i--) {
        op.add(arr1[i] + arr2[i]);
    }

    System.out.println(op);

}
