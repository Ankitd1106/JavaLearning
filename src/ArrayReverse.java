import java.util.Arrays;

public static void main(String[] args) {
    Object[] arr = {1, "Ankit", 1.2, true};

    Object[] revArr = new Object[arr.length];

    for (int i = arr.length - 1, j = 0; i >= 0; i--, j++) {
//        System.out.println(arr[i]);
        revArr[j] = arr[i];
    }

    System.out.println(Arrays.toString(revArr));
}



