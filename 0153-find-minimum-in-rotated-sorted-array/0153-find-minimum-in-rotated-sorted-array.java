class Solution {
    public int findMin(int[] nums) {
        int left = 0;
        int right = nums.length - 1; 
        while( left < right) {
            
            int mid = left + (right - left) / 2; 
            
            if(nums[mid] > nums[right]) {
                // search right
                left = mid + 1; 
            } else {
                // move right to mid. 
                //The minimum element is on the left side or at mid
                right = mid; 
            }
        }
        return nums[left]; 
    }
}