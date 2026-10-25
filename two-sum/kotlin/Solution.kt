class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val seen = HashMap<Int, Int>()  // number -> index
        for ((i, n) in nums.withIndex()) {
            val need = target - n
            seen[need]?.let { return intArrayOf(it, i) }
            seen[n] = i
        }
        return intArrayOf()
    }
}
