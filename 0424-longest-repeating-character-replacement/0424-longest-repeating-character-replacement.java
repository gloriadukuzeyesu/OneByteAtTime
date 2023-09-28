class Solution {
    public int characterReplacement(String s, int k) {
        // windowLen - count{x} <= k // valid window 
        Map<Character, Integer> counter = new HashMap<>();
        int L = 0; 
        int R = 0; 
        int res = 0; 
        while ( R < s.length()) {
            counter.put(s.charAt(R), counter.getOrDefault(s.charAt(R), 0) + 1); 
            int maxVal = maxCount (counter); 
            // check if it is a valid window
            if (R - L + 1  - maxVal <= k) {
                // valid window 
                res = Math.max(res, R - L + 1);  
            } else {
                // shrink the counter 
                counter.put(s.charAt(L), counter.getOrDefault(s.charAt(L), 0) - 1); 
                L++; 
            }
             R++;
            
        }
        return res; 
    }
    static int maxCount (Map<Character, Integer> counter) {
        int maxCount = 0; 
        for(int val : counter.values()) {
            maxCount = Math.max(val, maxCount);
        }
        return maxCount; 
    }
}