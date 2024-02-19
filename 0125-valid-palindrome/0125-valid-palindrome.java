class Solution {
    
    public boolean isPalindrome(String s) {
        s = s.toLowerCase(); 
        int left = 0, right = s.length() - 1; 
        while( left < right) {
             // remove spacesnon-alphanumeric characters
            while( !Character.isLetterOrDigit( s.charAt(left)) && left < right) {
                left++; 
            }
            while( !Character.isLetterOrDigit(s.charAt(right)) && left < right) {
                right--; 
            }
            if(s.charAt(left) != s.charAt(right)) {
                return false; 
            }
            left++; 
            right--; 
        }           
        return true; 
    }
                  
}