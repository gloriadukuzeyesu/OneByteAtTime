class Solution:
    def maxCount(self, m: int, n: int, ops: List[List[int]]) -> int:
      min_row = m
      min_col = n
      for y, x in ops:
        min_row = min(min_row, y)
        min_col = min(min_col, x)  
      return min_row * min_col
      