class Solution {
    public int findMin(int[] nums) {
        
        int l = 0;
        int r = nums.length - 1;

        while (l < r) {
            int mid = l + (r - l) / 2;

            if (nums[mid] > nums[r]) {
                // The minimum element is on the right side
                l = mid + 1;
            } else {
                // The minimum element is on the left side or at mid
                r = mid;
            }
        }

        // When the loop exits, 'l' will be pointing to the minimum element
        return nums[l];
        
    }
}