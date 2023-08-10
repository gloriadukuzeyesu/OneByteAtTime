class Solution {
    public void rotate(int[] nums, int k) {
        
        int [] copy = new int[nums.length]; 
        
        for (int i = 0; i < nums.length; i++) {
           int q = (i + k) % nums.length;   
           copy[q] = nums[i]; 
        }
        
        for(int i = 0; i < copy.length; i++) {
            nums[i] = copy[i]; 
        }
        
    }
}