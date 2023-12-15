class Solution:
    def imageSmoother(self, img: List[List[int]]) -> List[List[int]]:
      rows , cols = len(img), len(img[0])
      res = [ [0] * cols for _ in range(rows)]
      
      for row in range(rows):
          for col in range(cols):
            sum_total = count = 0
            for r in range(row - 1, row + 2):
                  for c in range(col - 1, col + 2):
                      if r >= 0 and r < rows and c >= 0 and c < cols:
                        sum_total += img[r][c]
                        count += 1
            res[row][col] = sum_total // count if count > 0 else 0
              
      return res
      

              