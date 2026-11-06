class Solution:
    def productExceptSelf(self, nums: list[int]) -> list[int]:
        n = len(nums)
        result = [1] * n

        prefix = 1                  # pass 1: left -> right
        for i in range(n):
            result[i] = prefix      # product of everything before i
            prefix *= nums[i]

        suffix = 1                  # pass 2: right -> left
        for i in range(n - 1, -1, -1):
            result[i] *= suffix     # prefix x product of everything after i
            suffix *= nums[i]

        return result
