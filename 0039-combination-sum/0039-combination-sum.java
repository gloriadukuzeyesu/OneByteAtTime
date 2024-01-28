class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> answer = new ArrayList<>(); 
        List<Integer> combination = new ArrayList<>(); 
        backtrack(candidates, 0, answer, combination, target); 
        return answer; 
    }
    public void backtrack(int[] candidates, int index, List<List<Integer>> answer, List<Integer> curr_combination, int target) {
        if(target == 0) {
            answer.add(new ArrayList<>(curr_combination)); 
            return; 
        }
        if(target < 0) {
            return; 
        }
        
        if(index >= candidates.length) {
            return; 
        }
  
        for(int i = index; i < candidates.length; i++) {
            curr_combination.add(candidates[i]); 
            backtrack(candidates, i, answer, curr_combination, target - candidates[i]);
            curr_combination.removeLast(); 
        }
    }
}