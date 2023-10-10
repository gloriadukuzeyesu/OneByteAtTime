class Solution {
    public String longestPalindrome(String s) {
        if(s.isEmpty()) {
            return null;
        }
        if(s.length() == 1) {
            return s;
        }
        String longest = s.substring(0,1);
        for(int i = 0; i < s.length(); i++) {
            // even
            String tempEven = expand(i,i,s);
            if(tempEven.length() > longest.length()) {
                longest = tempEven;
            }
            // odd
            String tempOdd = expand(i,i+1,s);
            if(tempOdd.length() > longest.length()) {
                longest = tempOdd;
            }
        }
        return longest;
    }
     private String expand(int i, int j, String s) {
          int left = i; 
          int right = j; 
          while(left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
              left--;
              right++;
          }
        return s.substring(left + 1, right); 
      }
}