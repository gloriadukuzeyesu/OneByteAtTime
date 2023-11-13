class Solution {
    public boolean exist(char[][] board, String word) {
        // find the first char
        // perfom dfs in four directions to find next character
        int rows = board.length; 
        int cols = board[0].length;  
        for(int i = 0; i < rows; i++) { 
            for(int j = 0; j < cols; j++) {
                if(board[i][j] == word.charAt(0) && dfs(board, i, j, word, 0)) {
                   return true; 
                }
            }
        }
        return false; 
    }
    public boolean dfs(char[][] grid, int row, int col, String word, int index) {
     
        // check boundaries
        if(row >= grid.length || row < 0 || col >= grid[0].length || col < 0 || grid[row][col] != word.charAt(index)) {
            return false; 
        }
        
        if(index == word.length() - 1) {
            return true; // word is found. 
        }
        grid[row][col] = '#'; // mark it 
   
        if( dfs(grid, row + 1, col, word, index + 1) || 
            dfs(grid, row + 1, col, word, index + 1) || 
            dfs(grid, row - 1, col, word, index + 1) || 
            dfs(grid, row, col + 1, word, index + 1) ||
            dfs(grid, row, col - 1, word, index + 1)) {
             return true; 
        }
        grid[row][col] = word.charAt(index); 
      return false; 
    }
}