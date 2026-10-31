class Solution {
    func isAnagram(_ s: String, _ t: String) -> Bool {
        if s.count != t.count { return false }
        var count = [Int](repeating: 0, count: 26)  // frequency counter for 'a'..'z'
        for c in s.utf8 { count[Int(c) - 97] += 1 }
        for c in t.utf8 { count[Int(c) - 97] -= 1 }
        return count.allSatisfy { $0 == 0 }
    }
}
