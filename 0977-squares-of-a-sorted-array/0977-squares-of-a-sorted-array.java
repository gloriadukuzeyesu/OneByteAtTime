class Solution {
    public int[] sortedSquares(int[] nums) {
        // Two pointers
        int L = 0; 
        int R = nums.length - 1;
        int [] res = new int[nums.length]; 
       
        for(int i = nums.length - 1; i >=0; i--) {
            if(Math.abs(nums[R]) > Math.abs(nums[L])) {
                res[i] = Math.abs(nums[R]) * Math.abs(nums[R]); 
                R--;   
            } else {
                 res[i] = Math.abs(nums[L]) * Math.abs(nums[L]);
                 L++; 
            }   
        } 
        return res; 
    }
}