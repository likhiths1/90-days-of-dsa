fn linear_search_checks(arr: &[i32], target: i32) -> usize {
    let mut checks = 0;
    for &x in arr {
        checks += 1;
        if x == target {
            return checks;
        }
    }
    checks
}

fn main() {
    let small = [7, 3, 9, 1, 5];
    let big = [7, 3, 9, 1, 8, 2, 6, 4, 10, 5];

    println!("{}", linear_search_checks(&small, 5)); // 5 checks  -> O(n)
    println!("{}", linear_search_checks(&big, 5));   // 10 checks -> 2x the input, 2x the work

    println!("{}", small[3]); // access by a known index -> 1 step -> O(1)
    println!("{}", big[9]);   // a bigger array, still 1 step
}
