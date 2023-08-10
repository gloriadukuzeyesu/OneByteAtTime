class Solution {
    private void reverse (int l, int r, int[] nums) {
        while (l < r) {
             int temp = nums[l]; 
            nums[l] = nums[r]; 
            nums[r] = temp; 
            l++; 
            r--;     
        }
    }
    public void rotate(int[] nums, int k) {
        k = k % nums.length; //  % to avoid k to ever jum out nums.length
        reverse(0, nums.length - 1, nums); 
        reverse(0, k - 1, nums); 
        reverse(k, nums.length - 1, nums);    
    }
}