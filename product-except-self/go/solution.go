func productExceptSelf(nums []int) []int {
    n := len(nums)
    result := make([]int, n)

    prefix := 1                 // pass 1: left -> right
    for i := 0; i < n; i++ {
        result[i] = prefix      // product of everything before i
        prefix *= nums[i]
    }

    suffix := 1                 // pass 2: right -> left
    for i := n - 1; i >= 0; i-- {
        result[i] *= suffix     // prefix x product of everything after i
        suffix *= nums[i]
    }
    return result
}
