class Solution {
    public int lengthOfLongestSubstring(String s) {
        // sliding window question 
        Set<Character> set = new HashSet<>(); 
        int fast = 0, slow = 0, maxlength = 0; 
        while (fast < s.length()) {
            char c = s.charAt(fast); 
            if(!set.contains(c)){
                set.add(c); 
                fast++;
                maxlength = Math.max(maxlength, set.size());    
            } else {
                set.remove(s.charAt(slow));
                slow++; 
            }  
        }
        return maxlength; 
            
        
    }
}