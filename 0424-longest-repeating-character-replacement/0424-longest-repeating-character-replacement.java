class Solution {
    public int characterReplacement(String s, int k) {
        int N = s.length(); 
        int window_start = 0;
        int max_count = 0; 
        int max_length = 0; 
        int[] char_counts = new int[26]; // each index will keep track of how many chars we have. Example: index A frequency will be kept at index 0, Bfrequency will be kept at index 1, etc.
        
        for(int window_end = 0; window_end < N; window_end++) {
            
            char_counts[s.charAt(window_end) - 'A']++;
            max_count = Math.max(max_count, char_counts[s.charAt(window_end) - 'A']); 
            
            while (window_end - window_start + 1 - max_count > k ) {
                // out of operations. 
                // we can't replace
                char_counts[s.charAt(window_start) - 'A']--;
                window_start++; 
            }
            max_length = Math.max(max_length, window_end - window_start + 1); 
        }
        
        return max_length; 
    }
}