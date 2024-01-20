class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>(); 
        int max = 0; 
        int fast = 0; 
        int slow = 0; 
        while(fast < s.length()) {
            char c = s.charAt(fast); 
            if(set.contains(c)) {
                set.remove(s.charAt(slow)); 
                slow++; 
               // set.clear();
            } else{
                set.add(c); 
                max = Math.max(max, set.size()); 
                fast++; 
            }
        }
        return max; 
        
    }
}