class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() < 1 || s == null) {
            return 0; 
        } 
        int i = 0; 
        int j = 0; 
        Set<Character> set = new HashSet<>();
        int max = Integer.MIN_VALUE;         
        while (j < s.length()) {
            char c = s.charAt(j); 
            if(!set.contains(c)) {
                set.add(c); 
                j++; 
                max = Math.max(max, set.size()); 
            } else {
                set.remove(s.charAt(i));
                i++; 
            }
        }
        return max; 
        
    }
}