class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
      track_map = {}
      for i, num in enumerate(nums):
        diff = target - num
        if diff in track_map:
          return [track_map[diff], i]
        track_map[num] = i
        
      return None
        