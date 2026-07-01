class Solution {

    public int numIslands(char[][] grid) {

        // Number of rows
        int m = grid.length;

        // Number of columns
        int n = grid[0].length;

        // Stores the number of islands
        int count = 0;

        // Traverse every cell in the grid
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // Found an unvisited land cell
                if (grid[i][j] == '1') {

                    // New island found
                    count++;

                    // Visit all connected land cells
                    dfs(grid, i, j);
                }
            }
        }

        return count;
    }

    // Depth First Search
    static void dfs(char[][] grid, int i, int j) {

        // Base case:
        // 1. Out of grid boundaries
        // 2. Water ('0')
        if (i < 0 || j < 0 ||
            i >= grid.length ||
            j >= grid[0].length ||
            grid[i][j] == '0') {
            return;
        }

        // Mark current land as visited
        grid[i][j] = '0';

        // Explore all four directions

        // Down
        dfs(grid, i + 1, j);

        // Up
        dfs(grid, i - 1, j);

        // Right
        dfs(grid, i, j + 1);

        // Left
        dfs(grid, i, j - 1);
    }
}
