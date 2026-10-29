fun linearSearchChecks(arr: IntArray, target: Int): Int {
    var checks = 0
    for (x in arr) {
        checks++
        if (x == target) {
            return checks
        }
    }
    return checks
}

fun main() {
    val small = intArrayOf(7, 3, 9, 1, 5)
    val big = intArrayOf(7, 3, 9, 1, 8, 2, 6, 4, 10, 5)

    println(linearSearchChecks(small, 5))  // 5 checks  -> O(n)
    println(linearSearchChecks(big, 5))    // 10 checks -> 2x the input, 2x the work

    println(small[3])  // access by a known index -> 1 step -> O(1)
    println(big[9])    // a bigger array, still 1 step
}
