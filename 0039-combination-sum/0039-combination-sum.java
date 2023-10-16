class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        List<List<Integer>> res = new ArrayList<>(); 
        List<Integer> curr = new ArrayList<>(); 
        dfs(res, candidates, curr,target, 0,0);
        return res; 
    }
    void dfs( List<List<Integer>> res, int[] candidates,List<Integer> curr,int target,int i,int total) {
        if(total == target) {
            res.add(new ArrayList<>(curr)); 
            return; 
        }
        if(i >= candidates.length || total > target ) {
            return; 
        }
        curr.add(candidates[i]); 
        dfs(res, candidates, curr, target, i, total + candidates[i]); 
        curr.remove(curr.size() - 1);
        dfs(res, candidates, curr, target, i + 1, total); 
    }
    
}