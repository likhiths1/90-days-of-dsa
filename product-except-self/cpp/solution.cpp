class Solution {
public:
    vector<int> productExceptSelf(vector<int>& nums) {
        int n = nums.size();
        vector<int> result(n, 1);

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
};
