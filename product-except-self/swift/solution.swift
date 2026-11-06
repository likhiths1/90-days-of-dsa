class Solution {
    func productExceptSelf(_ nums: [Int]) -> [Int] {
        let n = nums.count
        var result = [Int](repeating: 1, count: n)

        var prefix = 1                   // pass 1: left -> right
        for i in 0..<n {
            result[i] = prefix           // product of everything before i
            prefix *= nums[i]
        }

        var suffix = 1                   // pass 2: right -> left
        for i in stride(from: n - 1, through: 0, by: -1) {
            result[i] *= suffix          // prefix x product of everything after i
            suffix *= nums[i]
        }
        return result
    }
}
