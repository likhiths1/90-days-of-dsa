import "sort"

func groupAnagrams(strs []string) [][]string {
    groups := make(map[string][]string) // sorted word -> words
    for _, word := range strs {
        chars := []byte(word)
        sort.Slice(chars, func(i, j int) bool { return chars[i] < chars[j] })
        key := string(chars)
        groups[key] = append(groups[key], word)
    }
    result := make([][]string, 0, len(groups))
    for _, group := range groups {
        result = append(result, group)
    }
    return result
}
