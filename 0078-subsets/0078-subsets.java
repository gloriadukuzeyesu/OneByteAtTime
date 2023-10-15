class Solution {
    
    public List<List<Integer>> subsets(int[] nums) {
        List< List<Integer>> subSets = new ArrayList<>(); 
        generateSubSets(0, nums,new ArrayList<>(), subSets);
        return subSets; 
    }
    
    void generateSubSets(int index, int[]nums, List<Integer> current, List< List<Integer>> subSets) {
        subSets.add(new ArrayList<>(current)); 
        for(int i = index; i < nums.length; i++) {
            current.add(nums[i]); 
            generateSubSets( i + 1, nums, current, subSets);
            current.remove(current.size() - 1);   
        }
    }
}