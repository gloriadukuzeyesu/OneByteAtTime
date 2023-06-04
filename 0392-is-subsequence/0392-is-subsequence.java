class Solution {
    public boolean isSubsequence(String s, String t) {
        //UMPIRE 
          int i = 0; 
          int j = 0; 
        
        if (s.length() < 1) return true; 
        
        while (j < t.length()) {
            if(s.charAt(i) == t.charAt(j)) {
                i++; 
                j++;
            } else {
                j++; 
            }
            
             if(i == s.length()) 
             {
                return true; 
             } 
        }
        
       
        
        return false; 
        
        
        
        
        
            //abc , abmc => true
            //abc , bcma => false
            
            // two pointers
            // one pointer at s's charactes
            // second p at t's chars
            
            
            // point at same char = > increaement all
            // different increment secon until it finds char seating at one's pointer
            
            
            // second has not yet finished 
            
            
          
    }
}