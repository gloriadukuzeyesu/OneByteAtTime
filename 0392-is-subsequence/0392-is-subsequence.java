class Solution {
    public boolean isSubsequence(String s, String t) {
        // UMPIRE  s =  "", t = "abc"
        int ss = 0;
        int tt = 0; 
        if(s.length() == 0){
            return true; 
        } 
        
        while ( tt < t.length()) {
            if(s.charAt(ss) == t.charAt(tt)) {
                ss++;  
            } 
            tt++;
    
            if (ss == s.length()) {
                return true; 
            }
            
        }
        return false;   
    }
}