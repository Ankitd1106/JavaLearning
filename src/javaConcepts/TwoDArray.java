package javaConcepts;

import java.util.Random;

public class TwoDArray {
    public static void main(String[] args) {
        int m = 3; // Number of rows
        int n = 5; // Number of columns
        Random r = new Random();
        // Declare the matrix
        int[][] matrix = new int[m][n];

        // Assign values to the matrix manually
        // Example values to fill the matrix
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = r.nextInt(20); // Assign counter value to the matrix element
            }
        }

        // Print the matrix
        System.out.println("The matrix is:");
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
