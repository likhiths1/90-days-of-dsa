var seen = [Int: Int]()  // hash map (Dictionary): key -> value

seen[20] = 1  // store 20 -> 1
seen[30] = 2  // store 30 -> 2

print(seen[20]!)           // lookup 20 -> 1 (average O(1))
print(seen[30] != nil)     // key exists? -> true
print(seen[99] ?? -1)      // missing key -> -1
