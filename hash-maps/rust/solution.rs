use std::collections::HashMap;

fn main() {
    let mut seen: HashMap<i32, i32> = HashMap::new(); // hash map: key -> value

    seen.insert(20, 1); // store 20 -> 1
    seen.insert(30, 2); // store 30 -> 2

    println!("{}", seen[&20]);                            // lookup 20 -> 1 (average O(1))
    println!("{}", seen.contains_key(&30));               // key exists? -> true
    println!("{}", seen.get(&99).copied().unwrap_or(-1)); // missing key -> -1
}
