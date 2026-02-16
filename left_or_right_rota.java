import java.util.*;

class Main {
    public static void main(String[] args) {

        // 2D array (3 rows, 4 columns)
        int[][] arr = {
            {1,2,3,4},
            {5,6,7,8},
            {9,10,11,12}
        };

        // Start from row 1 (skip first row)
        for (int i = 1; i < arr.length; i++) {

            int rot = i;   // Number of rotations = row index

            // Perform rotation 'rot' times
            for (int r = 0; r < rot; r++) {

                // Store last element of the row
                int first = arr[i][arr[i].length - 1];

                // Shift elements to the right
                for (int j = arr[i].length - 1; j > 0; j--) {
                    arr[i][j] = arr[i][j - 1];
                }

                // Place last element at beginning
                arr[i][0] = first;
            }
        }

        // Print final matrix
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
