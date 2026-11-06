class Solution {
    fun productExceptSelf(nums: IntArray): IntArray {
        val n = nums.size
        val result = IntArray(n) { 1 }

        var prefix = 1                   // pass 1: left -> right
        for (i in 0 until n) {
            result[i] = prefix           // product of everything before i
            prefix *= nums[i]
        }

        var suffix = 1                   // pass 2: right -> left
        for (i in n - 1 downTo 0) {
            result[i] *= suffix          // prefix x product of everything after i
            suffix *= nums[i]
        }
        return result
    }
}
