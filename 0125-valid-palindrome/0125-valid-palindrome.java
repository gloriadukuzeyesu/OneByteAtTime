class Solution {
    public boolean isPalindrome(String s) {
        
        String sCopy = s.toLowerCase(); 
        
        int f = 0; 
        int b = sCopy.length() - 1; 
        
        while ( f < b) {
            while( !Character.isLetterOrDigit(sCopy.charAt(f))  && f < b) {
                f++; 
            }
            
            while ( !Character.isLetterOrDigit(sCopy.charAt(b)) && f < b) {
                b--; 
            }
            
            if(sCopy.charAt(f) != sCopy.charAt(b)) {
                return false;
            }
            f++;
            b--; 
        }
        return true;

    }
}