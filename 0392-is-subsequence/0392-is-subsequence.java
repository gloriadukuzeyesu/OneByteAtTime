class Solution {
    public boolean isSubsequence(String s, String t) {
        int i = 0; 
        int j = 0; 
        
        char ss [] = s.toCharArray(); 
        char tt [] = t.toCharArray();
        
        if (ss.length < 1) return true; 
    
        while (j < tt.length) {
            if( ss[i]  == tt[j] ) i++;  
            j++;
            
            if(i == ss.length)  return true; 
        }
        return false;    
    }
}