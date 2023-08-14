class Solution {
    public int myAtoi(String s) {
         s = s.trim(); 
        if(s == null || s.length() < 1) {
            return 0; 
        }
        int index = 0;
        boolean isNegative = s.startsWith("-"); 
        boolean isPositive = s.startsWith("+");
        if(isNegative) index++; 
        if(isPositive) index++; 
        
        final int INT_MAX = 2147483647;
        final int INT_MIN = -2147483648;
        
        double finalNumber = 0; 

        while (index < s.length() && s.charAt(index) >='0' &&  s.charAt(index) <= '9'){
            finalNumber = finalNumber * 10 + (s.charAt(index) - '0'); 
            index++; 
        }
        finalNumber = isNegative ? -finalNumber : finalNumber; 
        if(finalNumber < INT_MIN) {
            return INT_MIN;
        }
        if(finalNumber > INT_MAX) {
            return INT_MAX; 
        }
        return (int) finalNumber; 
    }
}