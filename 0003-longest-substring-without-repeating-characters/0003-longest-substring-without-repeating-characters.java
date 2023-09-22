class Solution {
    public int lengthOfLongestSubstring(String s) {
         List<Character> substring = new ArrayList<>();
        int maxLength = 0;

        // Iterate through the string
        for (char c : s.toCharArray()) {
            // If the current character is already in the substring, remove characters
            // from the beginning of the substring until the current character is removed.
            while (substring.contains(c)) {
                substring.remove(0);
            }
            
            // Add the current character to the end of the substring.
            substring.add(c);

            // Update maxLength if needed
            maxLength = Math.max(maxLength, substring.size());
        }
        return maxLength;
        
    }
}