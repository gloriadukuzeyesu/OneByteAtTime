class Solution {
    public int[] twoSum(int[] nums, int target) {
    
        Map<Integer, Integer> map = new HashMap<>(); 
        for(int i = 0; i < nums.length; i++) {
            int compl = target - nums[i]; // com = 3
            if(map.containsKey(compl) && map.get(compl) != i) {
                int[] res = {i, map.get(compl)};
                return res;
            } else {
               map.put(nums[i], i);  
            }
        }
        return null;        
    }
}