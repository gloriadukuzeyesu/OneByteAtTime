class Solution {
        Map<Integer, Integer>cache = new HashMap<>(); 
    public int fib(int n) {
        if(n==1)return 1; 
        if(n==0) return 0; 
        if(cache.containsKey(n)) {
            return cache.get(n); 
        }
        
        int fn = fib(n - 1) + fib(n - 2); 
        cache.put(n, fn);
        return cache.get(n);
        
//         if(n <=1) {
//             return n;
//         }
//         int current= 0;
//         int prev1 = 1; 
//         int prev2 = 0;
        
//         for(int i = 2; i < n + 1; i++) {
//             current = prev1 + prev2;
//             prev2 = prev1;
//             prev1 = current;
//         }
//         return current; 
          
    }
}