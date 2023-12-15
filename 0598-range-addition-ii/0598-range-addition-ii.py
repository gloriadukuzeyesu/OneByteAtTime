class Solution:
    def maxCount(self, m: int, n: int, ops: List[List[int]]) -> int:
      min_row = m
      min_col = n
      for x, y in ops:
        min_row = min(min_row, x)
        min_col = min(min_col, y) 
        
      return min_row * min_col
      