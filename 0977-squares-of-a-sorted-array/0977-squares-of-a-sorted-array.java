class Solution {
    public int[] sortedSquares(int[] nums) {
        int i = 0;
        int j = nums.length - 1; 
        int[] new_arr = new int [nums.length];
        for(int k = nums.length - 1; k >=0; k--) {
            if(Math.abs(nums[j]) > Math.abs(nums[i])) {
               new_arr[k] = nums[j] * nums[j];
                j--;
            } else {
               new_arr[k] = nums[i] * nums[i]; 
                i++;
            }
             
        }
        
        return new_arr;   
    }
}


//[-4,-1,0,3,10] i = 3 , j = 2 original  

// [-,-,-,-,100]
// j = 3 

// [0,1,9,16,100]  k = 0.  
