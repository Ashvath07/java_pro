import java.util.*;

class Solution {

    // Stores all valid N-Queen solutions
    List<List<String>> result = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {

        // Create n*n chess board
        char[][] board = new char[n][n];

        // Fill board with '.'
        for(int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        // Start placing queens from row 0
        solve(board, 0);

        return result;
    }

    // Backtracking function
    private void solve(char[][] board, int r) {

        // Base Case: All rows processed
        if(r == board.length) {

            List<String> temp = new ArrayList<>();

            // Convert board into List<String>
            for(char[] row : board) {
                temp.add(new String(row));
            }

            // Store valid solution
            result.add(temp);

            return;
        }

        // Try placing queen in every column of current row
        for(int c = 0; c < board.length; c++) {

            // Check whether current position is safe
            if(issafe(board, r, c)) {

                // Place Queen
                board[r][c] = 'Q';

                // Move to next row
                solve(board, r + 1);

                // Backtrack: Remove Queen
                board[r][c] = '.';
            }
        }
    }

    // Check if queen can be placed at (r,c)
    private boolean issafe(char[][] board, int r, int c) {

        // Check same column upwards
        for(int i = 0; i < r; i++) {

            if(board[i][c] == 'Q')
                return false;
        }

        // Check upper-left diagonal
        for(int i = r - 1, j = c - 1;
            i >= 0 && j >= 0;
            i--, j--) {

            if(board[i][j] == 'Q')
                return false;
        }

        // Check upper-right diagonal
        for(int i = r - 1, j = c + 1;
            i >= 0 && j < board.length;
            i--, j++) {

            if(board[i][j] == 'Q')
                return false;
        }

        // Safe position
        return true;
    }
}
