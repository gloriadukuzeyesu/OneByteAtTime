class Solution {
    public int countSubstrings(String s) {
        int count = 0; 
        for(int i = 0; i < s.length(); i++) {
            for(int j = i; j < s.length(); j++) {
                if(subString(s, i, j)) {
                    count++; 
                }
            }
            
        }
        return count; 
        
    }
    
    public boolean subString(String s, int i , int j ) {
        if(i < 0 || j > s.length() - 1) {
            return false; 
        }
        while( i <= j) {
            if(s.charAt(i) != s.charAt(j)) {
                return false; 
            } else {
                i++;
                j--; 
            }
        }
        return true; 
    }
}