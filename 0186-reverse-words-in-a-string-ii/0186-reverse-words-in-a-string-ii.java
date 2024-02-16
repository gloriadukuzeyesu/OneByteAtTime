class Solution {

    public void reverseWords(char[] s) {
       helper(s, 0, s.length-1);
       int l= 0;   
       for(int r= 0; r < s.length; r++){
           if(s[r] == ' '){
               helper(s, l, r -1);
               l = r + 1;
           }
       }
        helper( s, l, s.length - 1);  
    }
    
    public void helper(char[] s, int l, int r) {
        while( l < r) {
            char temp = s[l]; 
            s[l++] = s[r]; 
            s[r--] = temp; 
        } 
    }
}