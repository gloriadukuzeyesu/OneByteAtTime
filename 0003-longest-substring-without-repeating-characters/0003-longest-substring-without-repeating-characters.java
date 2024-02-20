class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> seen = new HashSet<>(); 
        int maxLength = 0 ; 
        int left = 0, right = 0; 
        while(right < s.length()) {
            char c = s.charAt(right); 
            if(seen.contains(c)) {
                // remove the c on the left
                seen.remove(s.charAt(left)); 
                left++;
                
            } else {
                seen.add(c); 
                right++; 
                maxLength = Math.max(maxLength, seen.size()); 
            }
        }
        return maxLength;
    }
}