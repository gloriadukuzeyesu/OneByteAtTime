class Solution {
    
    public int[] twoSum(int[] nums, int target) {
    
        for (int i = 0; i < nums.length; i++) {
              int curr = nums[i]; // 3
            for(int j = i + 1; j < nums.length; j++) {
                 // curr + x = target 
                int x = target - curr; 
                if(nums[j] == x) {
                    int[] res = {i,j};
                    return res;  
                }
            }
        }
        
        return null; 
    }
}
