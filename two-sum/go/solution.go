func twoSum(nums []int, target int) []int {
    seen := make(map[int]int) // number -> index
    for i, n := range nums {
        need := target - n
        if j, ok := seen[need]; ok {
            return []int{j, i}
        }
        seen[n] = i
    }
    return nil
}
