class Solution {
    public double myPow(double x, int n) {
        return binary(x, (long) n ); 
        
    }
    private double binary(double x , long n) {
        if(n == 0) {
            return 1; 
        }
        
        // n is negative
        if(n < 0) {
            return 1.0 / binary (x, - 1 * n);
        }
        
        // in case n is odd 
        if( n % 2 == 1) {
            return  x * binary( x * x , (n - 1) / 2); 
        } else {
            return binary ( x * x , n / 2); 
        }
        
    }
}