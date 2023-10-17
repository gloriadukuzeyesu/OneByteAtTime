class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>(); 
        backTrack(new ArrayList<>(), ans, nums); 
        return ans; 
    }
    void backTrack(List<Integer> curr, List<List<Integer>> ans, int[]nums) {
        // base case
        if(curr.size() == nums.length) {
            ans.add(new ArrayList<>(curr)); 
            return;
        }
        
        for(int num : nums) {
            if(!curr.contains(num)) {
                curr.add(num); 
                backTrack(curr, ans, nums);
                curr.remove(curr.size() - 1); 
            }
        }
    }
}