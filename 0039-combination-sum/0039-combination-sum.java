class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>(); 
        List<Integer> curr = new ArrayList<>(); 
        dfs(res, candidates, curr,0,target);
        return res; 
    }
    void dfs( List<List<Integer>> res, int[] candidates,List<Integer> curr,int i,int target) {
        if(target == 0) {
            res.add(new ArrayList<>(curr)); 
            return; 
        }
        if(i >= candidates.length ||  target < 0 ) {
            return; 
        }
        curr.add(candidates[i]); 
        dfs(res, candidates, curr,i, target - candidates[i]); 
        curr.remove(curr.size() - 1);
        dfs(res, candidates, curr,i + 1, target); 
    }
    
}