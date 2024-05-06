class Solution:
    def buildArray(self, nums: List[int]) -> List[int]:
        for i in range(len(nums)):
            ans = nums
            for j in range(len(nums)):
                ans[i] = nums[nums[j]]
        return ans