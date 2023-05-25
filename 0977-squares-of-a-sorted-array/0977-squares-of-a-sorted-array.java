class Solution {
    public int[] sortedSquares(int[] nums) {
        for(int i = 0; i < nums.length; i++) { // O(n)
          nums[i] = nums[i] * nums[i];    
        } 
        
        Arrays.sort(nums); //nlogn
        return nums;
    }
}