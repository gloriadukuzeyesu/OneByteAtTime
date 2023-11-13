class Solution {
    public int shortestBridge(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length; 

        boolean found = false;
      // Step 1: Find the first island and mark its cells as 2
        for(int i = 0; i < n; i++) {
            if(found) break; 
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 1) {                   
                    dfs(grid, i, j);
                    found = true;
                    break;
                }
            }
        }
        // expand the first islan using BFS to find the shortest path to the second island
        boolean[][] visited = new boolean[n][m]; 
        Queue<int[]> queue = new LinkedList<>(); 
        int[][] directions = {{-1,0}, {0,-1}, {1,0}, {0,1}};
        int distance = 0; 
        
        // add the cells of the first island to the queue
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                if(grid[i][j] == 2) {
                    queue.add(new int[] {i,j}); 
                    visited[i][j] = true; 
                }
            }
        }
        
        // do BFS to find the shortest path to the second island
        
        while(!queue.isEmpty()) {
            int size = queue.size(); 
            for(int i = 0; i < size; i++) {
                int[] curr = queue.poll(); 
                int currRow = curr[0]; 
                int currCol = curr[1]; 
                
                for(int[] dir : directions) {
                    int newRow = currRow + dir[0]; 
                    int newCol = currCol + dir[1]; 
                    if(newRow >= 0 && newRow < n && newCol >= 0 && newCol < m && !visited[newRow][newCol]) {
                        if(grid[newRow][newCol] == 1) {
                            return distance; 
                        }
                        queue.offer(new int[]{newRow,newCol}); 
                        visited[newRow][newCol] = true; 
                    }
                }
            }
            distance++; 
        }
        return -1; // in case there is no path between islands. 
        
        
    }
    
    public void dfs(int[][] grid, int row, int col) {
        if(row >= grid.length || row < 0 || col >= grid[0].length || col < 0 || grid[row][col] != 1) {
            return; 
        }
        grid[row][col] = 2; // mark this cell as visited
        dfs(grid, row + 1, col); 
        dfs(grid, row - 1, col); 
        dfs(grid, row, col + 1); 
        dfs(grid, row, col - 1); 
        return;
    }
}