class Solution {
    public int maxSubArray(int[] nums) {
        if(nums.length < 1) {
            return 0; 
        }
        int maxSum = nums[0];
        int currentSum = maxSum; 
        for(int i = 1; i < nums.length; i++) {
            currentSum = Math.max(currentSum + nums[i],nums[i]); 
            maxSum =  Math.max(currentSum, maxSum); 
        }
        return maxSum; 
    }
}