class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];

        int prefix = 1;                  // pass 1: left -> right
        for (int i = 0; i < n; i++) {
            result[i] = prefix;          // product of everything before i
            prefix *= nums[i];
        }

        int suffix = 1;                  // pass 2: right -> left
        for (int i = n - 1; i >= 0; i--) {
            result[i] *= suffix;         // prefix x product of everything after i
            suffix *= nums[i];
        }
        return result;
    }
}
