class Solution {
    fun topKFrequent(nums: IntArray, k: Int): IntArray {
        val count = HashMap<Int, Int>()  // number -> how many times it appears
        for (n in nums) {
            count[n] = count.getOrDefault(n, 0) + 1
        }

        val buckets = Array(nums.size + 1) { mutableListOf<Int>() }  // index = frequency
        for ((n, freq) in count) {
            buckets[freq].add(n)
        }

        val result = mutableListOf<Int>()
        for (freq in buckets.size - 1 downTo 1) {  // highest frequency first
            for (n in buckets[freq]) {
                result.add(n)
                if (result.size == k) return result.toIntArray()
            }
        }
        return result.toIntArray()
    }
}
