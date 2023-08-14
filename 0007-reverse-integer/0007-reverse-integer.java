class Solution {
    public int reverse(int x) {
        int result = 0; 
        int xremain = Math.abs(x); 
        while(xremain != 0) {
            int pop = xremain % 10; 
            xremain /= 10; 
            if (result > Integer.MAX_VALUE/10 || (result == Integer.MAX_VALUE / 10 && pop > 7)) return 0;
            if (result < Integer.MIN_VALUE/10 || (result == Integer.MIN_VALUE / 10 && pop < -8)) return 0;
            result = result * 10 + pop; 
            
        }
        return x < 0 ? -result : result; 
    }
}