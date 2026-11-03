class Solution {
    func topKFrequent(_ nums: [Int], _ k: Int) -> [Int] {
        var count = [Int: Int]()  // number -> how many times it appears
        for n in nums {
            count[n, default: 0] += 1
        }

        var buckets = [[Int]](repeating: [], count: nums.count + 1)  // index = frequency
        for (n, freq) in count {
            buckets[freq].append(n)
        }

        var result = [Int]()
        for freq in stride(from: buckets.count - 1, through: 1, by: -1) {  // highest frequency first
            for n in buckets[freq] {
                result.append(n)
                if result.count == k { return result }
            }
        }
        return result
    }
}
