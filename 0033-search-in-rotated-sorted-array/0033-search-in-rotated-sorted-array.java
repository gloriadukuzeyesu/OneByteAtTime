class Solution {
    public int search(int[] nums, int target) {
        int left = 0; 
        int right = nums.length - 1; 
        
        while(left <= right ) {
            int mid = left + (right - left) / 2; 
            if (nums[mid] == target) return mid; 
            
            if(nums[mid] >= nums[left]) { // middle num belongs to left sorted portion of the array 
                if(target > nums[mid] || target < nums[left]) {
                    // search on the right
                    left = mid + 1; 
                } else {
                    right = mid - 1; 
                }
                
            } else {
                // nums[mid] belongs to the right side. 
                if(target < nums[mid] || target > nums[right]) {
                    right = mid - 1; 
                } else {
                    left = mid + 1; 
                }
            }
        }
        return -1; 
    }
}