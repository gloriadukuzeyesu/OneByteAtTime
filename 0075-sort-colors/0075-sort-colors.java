class Solution {
    public void sortColors(int[] nums) {
        int l = 0; 
        int h = nums.length - 1; 
        int i = 0; 
        int pivot = 1; 
        while( i <= h) {
            if(nums[i] < pivot) {
                swap(nums, i++, l++); 
            } else if(nums[i] > pivot) {
                swap(nums, i, h--);
            } else{
                 i++; 
            }
           
        }
        
    }
    private void swap(int[] nums, int i , int j) {
        int temp = nums[i]; 
        nums[i] = nums[j];
        nums[j] = temp; 
    }
}