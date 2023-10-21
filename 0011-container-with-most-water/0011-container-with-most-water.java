class Solution {
    public int maxArea(int[] height) {
        int i = 0, j = height.length - 1; 
        int maxiAreaSoFar = 0; 
        
        while( i < j ) {
            int length = j - i;
            int width = Math.min(height[i], height[j]); 
            int area = length * width; 
            maxiAreaSoFar = Math.max(area, maxiAreaSoFar); 
            if(height[i] < height[j]) {
                i++; 
            } else {
                j--; 
            }
        }
        return maxiAreaSoFar; 
        
    }
}