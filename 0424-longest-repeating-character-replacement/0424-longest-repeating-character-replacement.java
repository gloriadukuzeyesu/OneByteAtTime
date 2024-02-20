class Solution {
    public int characterReplacement(String s, int k) {
        int[] frequency = new int[26]; 
        int result = 0; 
        int left = 0; 
        int maxSoFar = 0; 

        for(int right = 0; right < s.length(); right++) {
            frequency[s.charAt(right) - 'A']++; // update the count
            maxSoFar = Math.max(maxSoFar, frequency[s.charAt(right) - 'A']);    // grab the frequency of frequently seen num    
            if(right - left + 1 - maxSoFar > k) {
                // not valid 
                frequency[s.charAt(left) - 'A']--;
                left++;
            }
            
            result = Math.max(result, right - left + 1);
        }
        return result;
    }
}