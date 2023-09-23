class Solution {
    public int characterReplacement(String s, int k) {
        Map<Character, Integer> map = new HashMap<>();
        int l = 0; 
        int res = 0; 
        for(int i = 0; i < s.length(); i++) {
            char c = s.charAt(i); 
            map.put(c, map.getOrDefault(c,0) + 1); 
            int maxVal = maxCount(map);
            if(i - l + 1 - maxVal > k) {
                map.put(s.charAt(l), map.get(s.charAt(l)) - 1);
                l++;
            }
            res = Math.max(res, i - l + 1);
        }
        return res; 
    }

    private int maxCount(Map<Character, Integer>count) {
        int max = 0; 
        for(int val : count.values()) {
            max = Math.max(val, max);
        }
        return max; 
    } 
}