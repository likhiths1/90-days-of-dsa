func topKFrequent(nums []int, k int) []int {
    count := make(map[int]int) // number -> how many times it appears
    for _, n := range nums {
        count[n]++
    }

    buckets := make([][]int, len(nums)+1) // index = frequency
    for n, freq := range count {
        buckets[freq] = append(buckets[freq], n)
    }

    result := []int{}
    for freq := len(buckets) - 1; freq >= 1; freq-- { // highest frequency first
        for _, n := range buckets[freq] {
            result = append(result, n)
            if len(result) == k {
                return result
            }
        }
    }
    return result
}
