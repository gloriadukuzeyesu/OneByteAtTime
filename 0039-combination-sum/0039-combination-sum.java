class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> combination = new ArrayList<>();
        List<List<Integer>> results = new ArrayList<>(); 
        backTracking(candidates, 0, combination, results, target); 
        return results; 
    }
    public void backTracking(int[] candidates,
                             int index,  
                             List<Integer> combination,  
                             List<List<Integer>> results, 
                             int target) {
        if(target == 0) {
            results.add(new ArrayList<>(combination)); 
        }
        if(target < 0) {
            return; 
        }
        
        if(index >= candidates.length) {
            return;
        }
        
        for(int i = index; i < candidates.length; i++) {
            combination.add(candidates[i]); 
            backTracking(candidates, i, combination, results, target -  candidates[i]); 
            combination.remove(combination.size() - 1); 
        }
    }

}