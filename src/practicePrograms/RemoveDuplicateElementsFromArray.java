package practicePrograms;

public class RemoveDuplicateElementsFromArray {

    public static int[] removeDuplicates(int[] array) {
        int n = array.length;
        int[] temp = new int[n];
        int j = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int k = 0; k < j; k++) {
                if (array[i] == temp[k]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[j++] = array[i];
            }
        }

        int[] result = new int[j];
        for (int i = 0; i < j; i++) {
            result[i] = temp[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] array = {4, 2, 7, 4, 8, 2, 7, 1};
        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }

        int[] uniqueArray = removeDuplicates(array);

        System.out.println("\nArray without duplicates:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }
}
