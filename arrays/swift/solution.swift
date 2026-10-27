func linearSearch(_ arr: [Int], _ target: Int) -> Int {
    for (i, v) in arr.enumerated() {
        if v == target {
            return i  // found: return its index
        }
    }
    return -1  // not found
}

let arr = [10, 20, 30, 40]

print(arr[2])                  // access by index -> 30 (O(1))
print(linearSearch(arr, 40))   // linear search   -> 3  (O(n))
