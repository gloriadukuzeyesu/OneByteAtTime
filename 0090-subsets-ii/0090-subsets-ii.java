class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums); 
        List<List<Integer>> res = new ArrayList<>(); 
        List<Integer> curr = new ArrayList<>(); 
        backtrack(res, curr, nums,0); 
        return res;
    }
    void backtrack(List<List<Integer>>res,  List<Integer> curr, int[]nums, int index) {
        if(index == nums.length) {
            res.add(new ArrayList<>(curr));
            return;
        }
        // 1 first choice all substes that include nums[i]
        curr.add(nums[index]); 
        backtrack(res, curr, nums, index + 1); 
        curr.remove(curr.size() -1); 
        
        // 2 we don't include nums[i]
        while(index + 1 < nums.length && nums[index] == nums[index+1]) {
            index++;  
        }
        backtrack(res, curr, nums, index + 1);   
        return; 
    }
}