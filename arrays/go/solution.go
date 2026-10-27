package main

import "fmt"

func linearSearch(arr []int, target int) int {
    for i, v := range arr {
        if v == target {
            return i // found: return its index
        }
    }
    return -1 // not found
}

func main() {
    arr := []int{10, 20, 30, 40}

    fmt.Println(arr[2])                 // access by index -> 30 (O(1))
    fmt.Println(linearSearch(arr, 40))  // linear search   -> 3  (O(n))
}
