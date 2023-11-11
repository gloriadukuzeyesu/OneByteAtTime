class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        // int n = mat.length; 
        // int m = mat[0].length; 
        // int[] res = new int[n * m]; 
      
        if (mat == null || mat.length == 0 || mat[0].length == 0) {
            return new int[0];
        }
        
        int n = mat.length;
        int m = mat[0].length;
        int[] res = new int[n * m];
        int row = 0, col = 0, direction = 1; // 1 means moving up, -1 means moving down
        
        for (int i = 0; i < res.length; i++) {
            res[i] = mat[row][col];
            row -= direction;
            col += direction;
            
            // Check if the next position is out of bounds
            if (row >= n) {
                row = n - 1;
                col += 2;
                direction = -direction;
            }
            if (col >= m) {
                col = m - 1;
                row += 2;
                direction = -direction;
            }
            if (row < 0) {
                row = 0;
                direction = -direction;
            }
            if (col < 0) {
                col = 0;
                direction = -direction;
            }
        }
        
        return res;
        
        
    }
}