class Solution {
    public int search(int[] nums, int target) {
        int left = 0, right = nums.length - 1; 
        
        while(left <= right) {
            int mid =  left + (right - left) / 2; 

            if(nums[mid] == target) {
                return mid; 
            } else if (target < nums[mid]) {
                // search left
                right = mid - 1; 
            } else {
                // search right 
                left = mid + 1;  
            }
        }
        return -1; 
        
    }
}