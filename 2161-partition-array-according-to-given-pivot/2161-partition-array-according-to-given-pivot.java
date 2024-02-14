class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int left = 0, right = nums.length - 1; 
        int[] result = new int[nums.length]; 
        
        for(int i = 0; i < nums.length; i++) {
            // checking less val from the front of the array 
            if(nums[i] < pivot) {
                result[left++] = nums[i]; 
            }            
            // checking from the back of the array 
            if(nums[nums.length - 1 - i] > pivot) {
                result[right--] = nums[nums.length - 1 - i]; 
            }
        }
        
        while(left <= right) {
            result[left++] = pivot; 
            result[right--] = pivot;
        }
        
        
        return result; 
        
    }
}