public static void main(String[] args) {
    double[] arr = {2, 4, 55, 9, 1003, 75, 44, 9999, 384428.2, 934, 1, 0.01};
    double max = arr[0];
    double min = arr[0];
    for (double element : arr) {
        if (element > max) {
            max = element;
        }
        if (element < min) {
            min = element;
        }
    }
//    System.out.println(Arrays.toString(arr));
    System.out.println("max value = " + max);
    System.out.println("min value = " + min);
}
