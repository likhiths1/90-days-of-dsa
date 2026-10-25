class Solution {
    func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
        var seen = [Int: Int]()  // number -> index
        for (i, n) in nums.enumerated() {
            let need = target - n
            if let j = seen[need] {
                return [j, i]
            }
            seen[n] = i
        }
        return []
    }
}
