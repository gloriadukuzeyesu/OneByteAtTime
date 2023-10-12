class Solution {
    public int findNthDigit(int n) {
        long count = 9;
        int tier = 1; 
        int start = 1; 
        
        // find the tier 
        while(n > count * tier) {
            n -= count * tier; 
            tier++; // 2th, 3th, ...
            start *= 10; 
            count *= 10; 
        }
        start += (n - 1) / tier; 
        String s = Integer.toString(start); 
        return Character.getNumericValue( s.charAt( (n - 1) % tier)); 
    }
}