impl Solution {
    pub fn product_except_self(nums: Vec<i32>) -> Vec<i32> {
        let n = nums.len();
        let mut result = vec![1; n];

        let mut prefix = 1;                  // pass 1: left -> right
        for i in 0..n {
            result[i] = prefix;              // product of everything before i
            prefix *= nums[i];
        }

        let mut suffix = 1;                  // pass 2: right -> left
        for i in (0..n).rev() {
            result[i] *= suffix;             // prefix x product of everything after i
            suffix *= nums[i];
        }
        result
    }
}
