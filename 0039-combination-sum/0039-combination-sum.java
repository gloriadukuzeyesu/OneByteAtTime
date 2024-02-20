class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>(); 
        List<Integer> combination = new ArrayList<>();
        backtrack(candidates, combination, result, 0, target);
        
        return result; 
    }
    
    public void backtrack(int[]candidates, List<Integer>combination, List<List<Integer>> result, int index, int target) {
        
        if(target == 0) {
            result.add(new ArrayList<>(combination)); 
        }
        
        if(target < 0) {
            return;
        }
        
        if(target < 0 || index >= candidates.length) {
            return; 
        }
        
        for(int i = index; i < candidates.length; i++) {
            combination.add(candidates[i]); 
            backtrack(candidates, combination, result, i, target - candidates[i]);
            combination.remove(combination.size() - 1); 
        }
        
    }
    
}