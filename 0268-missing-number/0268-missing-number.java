class Solution {
    public int missingNumber(int[] nums) {
        Set<Integer> seen = new HashSet<>(); 
        for(int num : nums) seen.add(num); 
        int n = nums.length; 
        
        for(int expected = 0; expected < n + 1; expected++) {
            if(!seen.contains(expected)) {
                return expected; 
            }
        }
        return -1; 
    }
}