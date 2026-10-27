fun linearSearch(arr: IntArray, target: Int): Int {
    for (i in arr.indices) {
        if (arr[i] == target) {
            return i  // found: return its index
        }
    }
    return -1  // not found
}

fun main() {
    val arr = intArrayOf(10, 20, 30, 40)

    println(arr[2])                  // access by index -> 30 (O(1))
    println(linearSearch(arr, 40))   // linear search   -> 3  (O(n))
}
