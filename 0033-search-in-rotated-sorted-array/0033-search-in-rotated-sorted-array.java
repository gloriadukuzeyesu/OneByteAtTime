class Solution {
    public int search(int[] nums, int target) {
        int l = 0; 
        int r = nums.length - 1; 
        while( l <= r) {
            int mid = l + ( r - l) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if(nums[mid] >= nums[l]) {  // in which sorted portion does mid belong?
                // mid belongs to the left sorted portion of the array
                if(nums[l] <= target && target < nums[mid]) {
                    // target is on the left side
                    r = mid  - 1; 
                } else {
                    l = mid + 1; 
                }
                
            }else{
               if(nums[mid] < target && target <= nums[r]) {
                   l = mid + 1; 
               } else {
                   r = mid - 1; 
               }
            }
        }
        return -1; 
        
    }
}