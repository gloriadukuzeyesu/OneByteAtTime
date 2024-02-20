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
        
        /*
           int[] arr = new int[26];
        int ans = 0;
        int max = 0;
        int i = 0;
        for (int j = 0; j < s.length(); j++) {
            arr[s.charAt(j) - 'A']++;
            max = Math.max(max, arr[s.charAt(j) - 'A']);
            if (j - i + 1 - max > k) {
                arr[s.charAt(i) - 'A']--;
                i++;
            }
            ans = Math.max(ans, j - i + 1);
        }
        return ans;
        
        
        
        
        */
        
     
        
        
    }
}