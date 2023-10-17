class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> res = new ArrayList<>(); 
        dfs(res, new ArrayList<>(), candidates,target,0);
        return res; 
    }
    void dfs(List<List<Integer>> res, List<Integer> curr, int[] candidates, int target, int i) {
        // base case
        if(target == 0) {
            res.add(new ArrayList<>(curr)); 
            return; 
        }
        if(target <= 0) {
            return; 
        }
        int prev = -1;
        for(int j = i; j < candidates.length; j++) {
            if(candidates[j] == prev) continue;
            curr.add(candidates[j]); 
            dfs(res, curr, candidates, target - candidates[j], j + 1); 
            curr.remove(curr.size() - 1);
            prev = candidates[j];
            
        }
        return;
    }
}