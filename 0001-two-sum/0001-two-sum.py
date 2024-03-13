class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        dict_nums = {}
        result = []
        
        for i in range(len(nums)):
            dict_nums[nums[i]] = i
        
        for i in range(len(nums)):
            complement = target - nums[i]
            if complement in dict_nums and dict_nums[complement] != i:
                result.append(i)
                result.append(dict_nums[complement])
                return result