class Solution {
    public void moveZeroes(int[] nums) {
       //Input: nums = [0,1,0,3,12]
       // 1 ,0,0,3,12
       //1,3,12,0,0
       //1,0,1,3,0
       if(nums.length<=1 || nums==null){
           return;
        }
        int i = 0;
        int j = 0;
        while(j<nums.length){
           if(nums[j]!=0){
               int temp = nums[j];
               nums[j] = nums[i];
               nums[i] = temp;
               i++;
               j++;

            }else {
               j++;  
            }
        }
    }
}
