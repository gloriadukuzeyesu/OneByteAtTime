class Solution {
    public int missingNumber(int[] nums) {
        int sum1 = 0; 
        int sum2 = 0; 
        for(int i = 0; i < nums.length; i++) {
            sum1 += nums[i]; 
        }
         for(int i = 0; i <= nums.length; i++) {
            sum2 += i; 
        }
        return sum2 - sum1; 
    }
}

// [0,1]
// n = 2
    
// range : from 0 to 2 
// all numbers: 0, 1, 2
    
// Missing: 2 
//     return 2
// // approach 
    
// sum1 
// sum2 
// loop thru nums
// sum1: summing all numbers in array 
// sum2: summing indexes

// res =difference betwenn sum1 and sum2
//  return=res 
     