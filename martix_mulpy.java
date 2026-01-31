import java.util.*;

class Main {
    public static void main(String[] args) {

        // Scanner object to take input from user
        Scanner in = new Scanner(System.in);

        // ===== Input for first matrix =====
        System.out.println("Enter the number of rows for Matrix A:");
        int r1 = in.nextInt();

        System.out.println("Enter the number of columns for Matrix A:");
        int c1 = in.nextInt();

        // Declare first matrix
        int[][] a = new int[r1][c1];

        // Read elements of Matrix A
        System.out.println("Enter elements of Matrix A:");
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c1; j++) {
                a[i][j] = in.nextInt();
            }
        }

        // ===== Input for second matrix =====
        System.out.println("Enter the number of rows for Matrix B:");
        int r2 = in.nextInt();

        System.out.println("Enter the number of columns for Matrix B:");
        int c2 = in.nextInt();

        // Check whether matrix multiplication is possible
        if (c1 != r2) {
            System.out.println("Matrix multiplication is not possible");
            return;
        }

        // Declare second matrix
        int[][] b = new int[r2][c2];

        // Read elements of Matrix B
        System.out.println("Enter elements of Matrix B:");
        for (int i = 0; i < r2; i++) {
            for (int j = 0; j < c2; j++) {
                b[i][j] = in.nextInt();
            }
        }

        // Declare result matrix
        int[][] result = new int[r1][c2];

        // Matrix multiplication logic
        for (int i = 0; i < r1; i++) {
            for (int j = 0; j < c2; j++) {
                for (int k = 0; k < c1; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }

        // Print the resultant matrix
        System.out.println("Resultant Matrix:");
        for (int[] row : result) {
            System.out.println(Arrays.toString(row));
        }
    }
}
