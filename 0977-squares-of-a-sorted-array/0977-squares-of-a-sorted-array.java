class Solution {
    public int[] sortedSquares(int[] nums) {
        // 2 pointer questions 
      int len = nums.length;
      int L = 0;
      int R = len-1;
      int [] result = new int[len]; // to store new sorted squared values
      for(int i = len - 1; i >= 0; i--) {
          if(Math.abs(nums[L]) > Math.abs(nums[R])) {
              result[i] = nums[L] * nums[L]; 
              L++; 
          } else {
              result[i] = nums[R]  * nums[R]; 
              R--; 
          }
      }
      return result; 
    }
}