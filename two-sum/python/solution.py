class Solution:
    def twoSum(self, nums: list[int], target: int) -> list[int]:
        seen = {}  # number -> index
        for i, n in enumerate(nums):
            need = target - n
            if need in seen:
                return [seen[need], i]
            seen[n] = i
        return []
