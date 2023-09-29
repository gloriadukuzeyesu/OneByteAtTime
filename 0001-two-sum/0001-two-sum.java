class Solution {
    public int[] twoSum(int[] nums, int target) {
      Map<Integer, Integer> storage = new HashMap<>(); 
     for(int i = 0; i < nums.length; i++) {
         storage.put(nums[i], i);  
     }
        
     for (int i = 0; i < nums.length; i++) {
         // compl = target  - curr
         int compl = target - nums[i]; // 6 - 4
         if( storage.containsKey(compl) && storage.get(compl) != i) {
             int [] re = {i, storage.get(compl)};
          return  re;   
         }
     }
        return null;
        
    }
    
}
