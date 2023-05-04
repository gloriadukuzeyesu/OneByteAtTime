class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;
        Set<Integer>set = new HashSet<>(); 
        for(int num : nums) set.add(num); 
        // verify if the num has the left neigbor/ is the start of the sequence
        int ans = 1; 
        for(int num : nums) {
            // check if the num is the start of the sequence
            if(!set.contains(num - 1)) {
               int count = 1; 
                while(set.contains(num + 1)) {
                    count += 1; 
                    num++; 
                }
                ans = Math.max(ans, count);

            }
         

        }
        return ans; 
        
    }
}