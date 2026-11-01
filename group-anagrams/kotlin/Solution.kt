class Solution {
    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val groups = HashMap<String, MutableList<String>>()  // sorted word -> words
        for (word in strs) {
            val key = String(word.toCharArray().sortedArray())
            groups.getOrPut(key) { mutableListOf() }.add(word)
        }
        return groups.values.toList()
    }
}
