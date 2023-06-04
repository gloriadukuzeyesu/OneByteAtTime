class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; 
        int j = 0; 
        if (s.length() < 1) return true; 
    
        while (j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) i++;  
            
            j++;
            
            if(i == s.length())  return true; 
        }
        return false;    
    }
}