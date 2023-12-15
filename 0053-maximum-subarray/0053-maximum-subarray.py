class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
      ans = nums[0]
      curr_sum = 0
      
      for n in nums:
          if curr_sum < 0:
              curr_sum = 0
          curr_sum += n
          ans = max(ans, curr_sum)
      return ans
        
          
          
        