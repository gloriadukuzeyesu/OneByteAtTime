class Solution {
    public int numIdenticalPairs(int[] nums) {
        //int count = 0; 
//         for(int i = 0; i < nums.length; i++) {
//             for(int j = i + 1; j < nums.length; j++) {
//                 if(nums[i] == nums[j] && i < j) {
//                     count ++; 
//                 }
                
//             }
//         }
        
        Map<Integer, Integer> map = new HashMap<>(); 
        int count = 0;
        for(int num : nums) {
            count += map.getOrDefault(num,0);
            map.put(num, map.getOrDefault(num,0) + 1);
        }
        
        return count;
        
    }
}