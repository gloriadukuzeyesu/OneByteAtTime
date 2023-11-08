class Solution {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> output = new ArrayList<>(); 
        generateOutput(0, new ArrayList<>(), nums, output); 
        return output; 
        
    }
    public void generateOutput(int index, List<Integer>currentList, int[]nums,  List<List<Integer>> output) {
        output.add(new ArrayList<>(currentList)); 
        for(int i = index; i < nums.length; i++) {
            currentList.add(nums[i]);
            generateOutput(i + 1, currentList, nums, output);
            // backtrack
            currentList.remove(currentList.size() - 1); 
        }
    }
}