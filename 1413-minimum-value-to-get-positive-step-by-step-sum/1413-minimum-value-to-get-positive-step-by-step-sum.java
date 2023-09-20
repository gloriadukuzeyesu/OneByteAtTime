class Solution {
    public int minStartValue(int[] nums) {
        int min = 0, sum = 0; 
        for(int x : nums) {
            sum = sum + x; 
            min = Math.min(sum, min);
        }
        return 1 - min;
    }
}