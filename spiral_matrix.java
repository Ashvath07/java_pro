import java.util.*;

class Main {
    public static void main(String[] args) {

        // 2D Matrix
        int[][] mat = {
            {1,2,3},
            {4,5,6},
            {7,8,9}
        };

        // Initialize boundaries
        int top = 0;                       // Starting row
        int left = 0;                      // Starting column
        int right = mat[0].length - 1;     // Last column
        int bot = mat.length - 1;          // Last row
        
        // Run loop until boundaries cross
        while (top <= bot && left <= right) {

            // 1️⃣ Print top row (left → right)
            for (int i = left; i <= right; i++) {
                System.out.print(mat[top][i] + " ");
            }
            top++;   // Move top boundary down

            // 2️⃣ Print right column (top → bottom)
            for (int i = top; i <= bot; i++) {
                System.out.print(mat[i][right] + " ");
            }
            right--;   // Move right boundary left

            // 3️⃣ Print bottom row (right → left)
            if (top <= bot) {
                for (int i = right; i >= left; i--) {
                    System.out.print(mat[bot][i] + " ");
                }
                bot--;   // Move bottom boundary up
            }

            // 4️⃣ Print left column (bottom → top)
            if (left <= right) {
                for (int i = bot; i >= top; i--) {   //
                    System.out.print(mat[i][left] + " ");
                }
                left++;   // Move left boundary right
            }
        }
    }
}
