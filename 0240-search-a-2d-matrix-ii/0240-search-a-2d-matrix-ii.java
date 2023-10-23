class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix.length <= 0) {
            return false; 
        }
        int rows = matrix.length; 
        int cols = matrix[0].length; 
        
        int row = 0; 
        int col = cols - 1; 
        
        while(row < rows && col >= 0) {
            int currElement = matrix[row][col]; 
            if(currElement == target) {
                return true; 
            } else if (currElement > target) {
                col--; 
            } else {
                row++;
            }
        }
        return false;  
    }
}