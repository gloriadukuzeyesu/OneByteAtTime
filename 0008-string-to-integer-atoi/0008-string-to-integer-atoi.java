class Solution {
    public int myAtoi(String s) {
        int index = 0; 
        int sign = 1; 
        int results = 0; 
        //skip all white spaces
        while (index < s.length() && s.charAt(index) == ' ') {
            index++;
        }
        
        if(index < s.length() && (s.charAt(index) =='-' || s.charAt(index) == '+') ) {
            if(s.charAt(index) == '-') {
                sign = -1;
            } else {
                sign = 1;
            }
            index++;
        }
        
        while (index < s.length() && Character.isDigit(s.charAt(index))) {
            int digit = s.charAt(index) - '0'; // convert char to int 
            //check for overflow 
            if(results > Integer.MAX_VALUE / 10 || (results == Integer.MAX_VALUE / 10 && digit > 7)) {
                if(sign == -1) {
                    return Integer.MIN_VALUE; 
                } else {
                    return Integer.MAX_VALUE;
                }
            }
            results = results * 10 + digit; 
            index++;
        }
        return results * sign;
    }
}