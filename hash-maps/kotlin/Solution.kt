fun main() {
    val seen = HashMap<Int, Int>()  // hash map: key -> value

    seen[20] = 1  // store 20 -> 1
    seen[30] = 2  // store 30 -> 2

    println(seen[20])               // lookup 20 -> 1 (average O(1))
    println(seen.containsKey(30))   // key exists? -> true
    println(seen[99] ?: -1)         // missing key -> -1
}
