class Solution:
    def shuffle(self, nums: List[int], n: int) -> List[int]:
        res = []
        left_arr = nums[:n]
        right_arr = nums[n:]
        for x in range(len(left_arr)):
          res.append(left_arr[x])
          res.append(right_arr[x])
      
        return res
        