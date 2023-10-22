class Solution {
    
    public int countSubstrings(String s) {
        int count = 0; 
        if(s.length() < 0) {
            return count; 
        }
        for(int i = 0; i < s.length(); i++) {
            count += subString(s,i,i); // odd 
            count += subString(s,i,i+1); // even
        }
        return count;
    }
    public int subString( String s, int i, int j) {
        int count = 0;
         while( i >= 0 && j < s.length()) {
             if(s.charAt(i) != s.charAt(j)){
                 break; 
             } else {
                 i--;
                 j++; 
                 count++;
             }
         }
        return count; 
       
    }
}