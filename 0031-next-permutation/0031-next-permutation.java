class Solution {
    // space O(1)
    // time O(n)
    
    public void swap(int[]nums, int i, int j) {
        int temp = nums[i]; 
        nums[i] = nums[j];
        nums[j] = temp; 
    }
    
    public void nextPermutation(int[] nums) {
        // one of the worst questions. 
        int n = nums.length; 
        int pivot = n - 1; 
        
        while (pivot >= 1 && nums[pivot] <= nums[pivot - 1]) {
            pivot--; 
        }
        
        if(pivot != 0) {
            int i = n - 1; 
            
            while(nums[i] <= nums[pivot - 1]) {
                i--;
            }
            swap(nums, pivot - 1, i);  
        }
        
        int left = pivot; 
        int right = n - 1; 
        
        while(left < right) {
            swap(nums, left, right); 
            left++; 
            right--; 
        } 
    }
}