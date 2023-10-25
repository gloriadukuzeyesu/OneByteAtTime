class Solution {
    public int minPathSum(int[][] grid) {
        if(grid.length == 0) {
            return 0; 
        }
        int rows = grid.length; 
        int cols = grid[0].length; 
        
        int[][] dp = new int[rows][cols]; 
        for(int r = 0; r < rows; r++) {
            for(int c = 0; c < cols; c++) {
                dp[r][c] = grid[r][c]; 
                
                if( r > 0 && c > 0) {
                    dp[r][c] += Math.min(dp[r - 1][c], dp[r][c - 1]);
                } else if ( r > 0) {
                    dp[r][c] += dp[r - 1][c];
                } else if (c > 0) {
                    dp[r][c] += dp[r][c - 1]; 
                }
            }
        } 
        return dp[rows - 1][cols- 1];   
    }
}