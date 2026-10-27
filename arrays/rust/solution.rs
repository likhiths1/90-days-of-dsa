fn linear_search(arr: &[i32], target: i32) -> Option<usize> {
    for (i, &v) in arr.iter().enumerate() {
        if v == target {
            return Some(i); // found: return its index
        }
    }
    None // not found
}

fn main() {
    let arr = [10, 20, 30, 40];

    println!("{}", arr[2]);                    // access by index -> 30 (O(1))
    println!("{:?}", linear_search(&arr, 40)); // linear search   -> Some(3) (O(n))
}
