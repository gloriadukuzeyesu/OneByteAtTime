class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        if(grid == null || grid.length == 0) {
            return count; 
        }
        
        for(int r = 0; r < grid.length; r++) {
            for(int c = 0; c < grid[0].length; c++) {
                if(grid[r][c] == '1') {
                    dfs(grid,r,c);
                    count++;
                }
            }
        }
        return count; 
    }
    void dfs(char[][]grid,int r,int c) {
        if( r < 0 || c < 0 || r > grid.length - 1 || c > grid[0].length - 1 ) return; 
        
        if(grid[r][c] == '1') {
            grid[r][c] = '0'; 
            dfs(grid,r - 1,c);
            dfs(grid,r + 1,c);
            dfs(grid,r,c + 1);
            dfs(grid,r,c - 1);
        }
        return; 
    }
}