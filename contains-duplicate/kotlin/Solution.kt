class Solution {
    fun containsDuplicate(nums: IntArray): Boolean {
        val seen = HashSet<Int>()
        for (n in nums) {
            if (n in seen) {
                return true
            }
            seen.add(n)
        }
        return false
    }
}
