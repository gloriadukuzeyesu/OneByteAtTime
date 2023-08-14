class Solution {
    public boolean isPalindrome(String s) {
        if(s.length() <=0) return true; 
        s = s.toLowerCase(); 
        
        int i = 0; 
        int j = s.length() - 1; 
        
        while ( i < j) {
            while (i < j && !Character.isLetterOrDigit(s.charAt(i))){
                i++; 
            }
           while (i < j & !Character.isLetterOrDigit(s.charAt(j))){
                j--; 
            }
                  
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