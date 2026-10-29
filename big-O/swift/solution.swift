func linearSearchChecks(_ arr: [Int], _ target: Int) -> Int {
    var checks = 0
    for x in arr {
        checks += 1
        if x == target {
            return checks
        }
    }
    return checks
}

let small = [7, 3, 9, 1, 5]
let big = [7, 3, 9, 1, 8, 2, 6, 4, 10, 5]

print(linearSearchChecks(small, 5))  // 5 checks  -> O(n)
print(linearSearchChecks(big, 5))    // 10 checks -> 2x the input, 2x the work

print(small[3])  // access by a known index -> 1 step -> O(1)
print(big[9])    // a bigger array, still 1 step
