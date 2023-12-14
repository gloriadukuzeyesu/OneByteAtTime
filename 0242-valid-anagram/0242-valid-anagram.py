class Solution:
    def isAnagram(self, s: str, t: str) -> bool:
      if len(s) != len(t):
        return False

      frequency = {}
      
      for c in s:
        if c in frequency:
           frequency[c] += 1
        else:
          frequency[c] = 1
                
      for c in t:
        if c in frequency and frequency[c] > 0:
           frequency[c] -= 1
        else:
          return False
        
      return True
        
          
        

        