class Solution {
    public String longestPalindrome(String s) {
        String ss = s.substring(0, 1); 
        for(int i = 0; i < s.length(); i++) {
            // odd
            String oddString = checkPalindrome(s, i, i + 1); 
            if(ss.length() < oddString.length()) {
                ss = oddString; 
            }
            // even 
             String evenString = checkPalindrome(s, i, i);
             if(ss.length() < evenString.length()) {
                ss = evenString; 
            }
            
        }
        return ss; 
        
    }
    
    public String checkPalindrome(String s, int start, int end) {
        while(start >= 0 && end < s.length() && start <= end && s.charAt(start) == s.charAt(end)) {
            start--; 
            end++;   
        }
        return s.substring(start + 1, end); 
    }
}