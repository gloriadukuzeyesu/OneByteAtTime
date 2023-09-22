class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>(); 
        int l = 0; 
        int r = 0;
        int max= 0; 
        while (r < s.length()) {
            char c = s.charAt(r); 
            if(set.contains(c)) {
                // remove the l
                char k = s.charAt(l); 
                set.remove(k);
                l++;
            } else {
                set.add(c);
                r++;
                max = Math.max(set.size(), max);
            }
        }
        return max; 
    }
}