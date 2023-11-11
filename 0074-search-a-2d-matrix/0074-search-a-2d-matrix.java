class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        if(matrix == null || matrix.length == 0) {
            return false; 
        }
        int rows = matrix.length;
        int cols = matrix[0].length;
        // Step 1: Binary search to find the row where the target might be located.
        int left = 0; 
        int right = rows - 1; 
        while( left < right) {
            int mid = left + (right - left) / 2; 
            int midElement = matrix[mid][cols - 1]; 
            if(midElement == target) return true; 
            
            if(midElement < target) {
                left = mid + 1; 
            } else {
                right = mid; 
            }
        }  
        // the right holds the index of the row where the target might located. 
        // step 2. Binary seach the row to find target 
        return searchRow(matrix[right], target); 
    }
    private boolean searchRow (int [] row, int target) {
        int l = 0; 
        int r = row.length - 1; 
        while(l <= r)  {
            int mid = l + (r - l) / 2; 
            if(row[mid] == target) {
                return true; 
            } else if (row[mid] < target) {
                l = mid + 1; 
            } else {
                r = mid - 1; 
            }
        }
        return false; 
    }
}