class Solution {

    public int numIslands(char[][] grid) {

        int rows = grid.length;
        int cols = grid[0].length;

        int islandCount = 0;

        // Traverse every cell of the grid
        for(int r = 0; r < rows; r++) {

            for(int c = 0; c < cols; c++) {

                // If we find land ('1'), it means we found a new island
                if(grid[r][c] == '1') {

                    /*
                     I used DFS approach here.
                     Once land is found, we explore all connected land cells
                     (up, down, left, right) and mark them visited so that
                     the same island is not counted again.
                    */

                    dfs(grid, r, c);
                    islandCount++;
                }
            }
        }

        return islandCount;
    }


    private void dfs(char[][] grid, int row, int col) {

        int rows = grid.length;
        int cols = grid[0].length;

        // Base condition: stop if out of bounds or water is reached
        if(row < 0 || col < 0 || row >= rows || col >= cols || grid[row][col] == '0')
            return;

        // Mark the current land cell as visited
        grid[row][col] = '0';

        // Explore neighbouring cells using DFS
        dfs(grid, row + 1, col); // down
        dfs(grid, row - 1, col); // up
        dfs(grid, row, col + 1); // right
        dfs(grid, row, col - 1); // left
    }
}
