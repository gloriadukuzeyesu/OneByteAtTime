class Solution {
    public int fib(int n) {
        // Dp using botton up technique 
        if(n <= 1) return n; 
        int prev1 = 0; 
        int prev2 = 1; 
        int current = 0; 
        for(int i = 2; i < n + 1; i++) {
            current = prev1 + prev2; 
            prev1 = prev2; 
            prev2 = current; 
        }
        return current; 
    }
}