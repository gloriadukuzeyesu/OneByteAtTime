class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>(); 
        for(int i : nums) {
            set.add(i);
        }
        
        // find the start of the sequence
        int longest = 0; 
        for(int num : nums) {
            if(!set.contains(num - 1)) {
                // start of the sequence 
                int len = 0; 
                while (set.contains(num + len)) {
                    len ++; 
                }
                longest = Math.max(longest, len);
            }
            
        }
        return longest;
    }
}