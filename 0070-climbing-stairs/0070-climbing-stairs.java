class Solution {
    public int climbStairs(int n) {
        Map<Integer, Integer> memo = new HashMap<>();
        return climb_Stairs(n, memo);
        
    }
    
    public int climb_Stairs(int n, Map<Integer, Integer> memo) {
        if(memo.containsKey(n)) {
            return memo.get(n);
        }
        if(n == 0) {
            return 1;
        }
        if(n < 0) {
            return 0;
        }
        
        int ways = climb_Stairs( n - 1, memo) + climb_Stairs(n - 2, memo);
        memo.put(n, ways);
        return ways;
    }
}