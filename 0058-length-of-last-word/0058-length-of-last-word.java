class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0; 
        
        for(int i = s.length() - 1; i >= 0; i--) {
            if(s.charAt(i) != ' ') {
                length++; // increment the length if a non space character is found
            } else {
                if(length > 0 ) return length; // if the lenght is greater than 0, it means that the last word's length has already been found. 
            }
        }
        return length; 
    }
}