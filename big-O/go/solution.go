package main

import "fmt"

func linearSearchChecks(arr []int, target int) int {
    checks := 0
    for _, x := range arr {
        checks++
        if x == target {
            return checks
        }
    }
    return checks
}

func main() {
    small := []int{7, 3, 9, 1, 5}
    big := []int{7, 3, 9, 1, 8, 2, 6, 4, 10, 5}

    fmt.Println(linearSearchChecks(small, 5)) // 5 checks  -> O(n)
    fmt.Println(linearSearchChecks(big, 5))   // 10 checks -> 2x the input, 2x the work

    fmt.Println(small[3]) // access by a known index -> 1 step -> O(1)
    fmt.Println(big[9])   // a bigger array, still 1 step
}
