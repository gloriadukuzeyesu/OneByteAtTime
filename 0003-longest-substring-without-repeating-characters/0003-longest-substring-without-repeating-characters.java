class Solution {
    public int lengthOfLongestSubstring(String s) {
       //sliding window
        int fast = 0, slow = 0, maxLength = 0; 
        Set<Character>set = new HashSet<>(); 
        while (fast < s.length() ) {
            if(!set.contains(s.charAt(fast))) {
                set.add(s.charAt(fast)); 
                fast++; 
                maxLength = Math.max(maxLength,set.size()); 
            } else {
                set.remove(s.charAt(slow)); 
                slow++;    
            }
        }
        return maxLength;   
    }
}