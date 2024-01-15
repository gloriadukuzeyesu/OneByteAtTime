class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>(); 
        for(int num : nums) set.add(num); 
        int longest_cons = 0; 
        
        //for nums and for each num, verify if it has a left neigh
        for(int curr_num : nums) {
            //int curr_num = num; 
            if(!set.contains(curr_num - 1)) {
                // start of sequence
                int long_sequence_so_far = 1; 
                while(set.contains(curr_num + 1)) {
                    long_sequence_so_far += 1; 
                    curr_num += 1; 
                }
                longest_cons = Math.max(longest_cons, long_sequence_so_far);
            }
            
        }
        return longest_cons; 
        
    }
}