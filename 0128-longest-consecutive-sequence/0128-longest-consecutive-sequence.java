class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        int longest = 0; 
        for(int num : nums) {
            if(!set.contains(num - 1)) {
                // start of the sequence
                int leng = 0; 
                while (set.contains(num + leng)) {
                    leng ++; 
                }
                longest = Math.max(longest, leng); 
            }
        }
        return longest; 
        
    }
}