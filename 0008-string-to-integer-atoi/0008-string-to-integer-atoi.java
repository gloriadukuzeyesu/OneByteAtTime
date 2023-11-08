class Solution {
    public int myAtoi(String s) {
        int res = 0; 
        boolean isNegative = false; 
        int read = 0; 
        while(read < s.length() && s.charAt(read) == ' ') {
            // step1
             read++; 
        }
        
        if(read < s.length() && (s.charAt(read) =='-' || s.charAt(read) == '+') ) {
            if(s.charAt(read) == '-') {
                isNegative = true;
            } 
            // else {
            //     isNegative = false;
            // }
            read++;
        }
        
        
        
        while(read < s.length() && Character.isDigit(s.charAt(read))) {
            int digit = s.charAt(read) - '0'; // convert to int
            
            // clamp
            if( (res > Integer.MAX_VALUE / 10) || (res == Integer.MAX_VALUE / 10 && digit > Integer.MAX_VALUE % 10)) {
                if(isNegative) {
                    return  Integer.MIN_VALUE;
                } else {
                    return  Integer.MAX_VALUE;
                }
                
            }
            
            res = res * 10 + digit;
            read++; 
         }
        
        if(isNegative) {
            res = - res; 
        }
        
        return res; 
    }
}