class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int[] result = new int[nums.length]; 
        int left = 0, right = nums.length - 1; 
        
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] < pivot) {
                result[left++] = nums[i]; 
            }
            
            //back 
            if(nums[nums.length - 1 - i] > pivot) {
                result[right--] = nums[nums.length - 1 - i]; 
            }
        }
        
        // System.out.println("Result: " + Arrays.toString(result)); 
        while(left <= right) {
            result[left++] = pivot; 
            result[right--] = pivot; 
        }
        return result; 
        
    }
}