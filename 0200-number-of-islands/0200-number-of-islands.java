class Solution {
    public int numIslands(char[][] grid) {
        int rows = grid.length; 
        int cols = grid[0].length; 
        int count = 0; 
        
        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                if(grid[r][c] == '1') {
                    dfs(grid, r, c); 
                    count++;    
                }
            }
        }
        return count; 
    }
    public void dfs (char[][] grid, int row, int col) {
        int rows = grid.length; 
        int cols = grid[0].length; 
        // bounds checks 
        if(row < 0 || row >= rows || col < 0 || col >= cols || grid[row][col] != '1') {
            return; 
        }
        grid[row][col] = '0'; 
        dfs(grid, row + 1, col); 
        dfs(grid, row - 1, col); 
        dfs(grid, row, col + 1); 
        dfs(grid, row, col - 1); 
        return; 
    }
}