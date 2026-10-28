package main

import "fmt"

func main() {
    seen := make(map[int]int) // hash map: key -> value

    seen[20] = 1 // store 20 -> 1
    seen[30] = 2 // store 30 -> 2

    fmt.Println(seen[20]) // lookup 20 -> 1 (average O(1))

    _, ok := seen[30]
    fmt.Println(ok) // key exists? -> true

    if v, found := seen[99]; found {
        fmt.Println(v)
    } else {
        fmt.Println(-1) // missing key -> -1
    }
}
