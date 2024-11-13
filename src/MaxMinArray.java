public static void main(String[] args) {
    int[] arr = {2,4,55,9,1003,75,44,9999,384428,934};

    int max = arr[0];
    int min = arr[0];

    for (int element : arr){
        if (element > max){
            max = element;
        }

        if (element < min){
            min = element;
        }
    }

    System.out.println("max value in the array is "+max);
    System.out.println("min value in the array is "+min);

}
