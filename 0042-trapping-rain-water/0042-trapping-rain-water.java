class Solution {
    public int trap(int[] height) {
        int[] leftMaxes = new int[height.length]; 
        int[] rightMaxes = new int[height.length]; 
        leftMaxes[0] = height[0]; 
        for(int i = 1; i < height.length; i++) {
            leftMaxes[i] = Math.max(height[i], leftMaxes[i-1]); 
        }
          rightMaxes[height.length - 1] = height[height.length - 1]; 
         for(int i = height.length - 2; i >= 0; i--) {
            rightMaxes[i] = Math.max(height[i], rightMaxes[i+1]); 
        }
        int ans  = 0; 
        for(int i = 1; i < height.length - 1; i++) {
            ans += Math.min(leftMaxes[i], rightMaxes[i]) - height[i]; 
        }
        return ans; 
    }
}