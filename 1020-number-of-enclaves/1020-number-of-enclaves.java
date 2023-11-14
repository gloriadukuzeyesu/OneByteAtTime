class Solution {
    public int numEnclaves(int[][] grid) {
        int rows = grid.length; 
        int cols = grid[0].length; 
        boolean [][]visited = new boolean [rows][cols]; 
        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                if( (r == 0 || c == 0 || r == rows - 1 || c == cols - 1) && grid[r][c] == 1 && !visited[r][c]) {
                    dfs(grid, r, c, visited); 
                    
                }
            }
        }
        
        int count = 0; 
          for(int i = 0; i < rows; i++) {
            for(int j = 0; j < cols; j++) {
                if(grid[i][j] == 1 && !visited[i][j]) {
                    System.out.println("Test3 " + count); 
                   count++; 
                    
                }
            }
        }
        
        return count; 
    }
    public void dfs(int[][] grid, int row, int col, boolean[][] visited) {
        int rows = grid.length, cols = grid[0].length; 
        
        if(row >= rows || row < 0 || col < 0 || col >= cols || visited[row][col] || grid[row][col] == 0) {
            return; 
        }

        visited[row][col] = true;  
        dfs(grid, row + 1, col, visited); 
        dfs(grid, row - 1, col, visited); 
        dfs(grid, row, col - 1, visited); 
        dfs(grid, row, col + 1, visited); 
        
    }
}