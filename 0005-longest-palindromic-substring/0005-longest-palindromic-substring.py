class Solution:
    
    def longestPalindrome(self, s: str) -> str:
        if not s:
            return ""
    
        n = len(s)
        # Create a 2D table to store whether substrings are palindromes
        dp = [[False] * n for _ in range(n)]

        # All substrings of length 1 are palindromes
        for i in range(n):
            dp[i][i] = True

        start = 0  # Initialize the start of the longest palindromic substring
        max_length = 1  # Initialize the length of the longest palindromic substring

        for length in range(2, n + 1):
            for i in range(n - length + 1):
                j = i + length - 1
                if s[i] == s[j] and (length == 2 or dp[i + 1][j - 1]):
                    dp[i][j] = True
                    if length > max_length:
                        max_length = length
                        start = i

        return s[start:start + max_length]


    