class Solution {
    public int search(int[] nums, int target) {
        if(nums == null) return -1; 
        int l = 0, r = nums.length - 1; 
        while( l <= r) {
            int mid = l + (r - l) / 2; 
            System.out.println(mid); 
            if(nums[mid] == target) {
                return mid; 
            } else if(nums[mid] >= nums[l]){ // 3 > 3 
                if(nums[l] <= target && target < nums[mid]) {
                    r = mid - 1 ; 
                } else {
                    l = mid + 1; 
                }

            } else {
                if(nums[mid] < target && target <= nums[r]) { // 3 < 1 && 1 <= 1 
                    l = mid + 1; 
                } else {
                    r = mid - 1; 
                }
            }
        }
        return -1;

    }
}