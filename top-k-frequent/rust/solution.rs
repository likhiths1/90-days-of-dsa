use std::collections::HashMap;

impl Solution {
    pub fn top_k_frequent(nums: Vec<i32>, k: i32) -> Vec<i32> {
        let mut count: HashMap<i32, usize> = HashMap::new(); // number -> how many times it appears
        for n in &nums {
            *count.entry(*n).or_insert(0) += 1;
        }

        let mut buckets: Vec<Vec<i32>> = vec![Vec::new(); nums.len() + 1]; // index = frequency
        for (n, freq) in count {
            buckets[freq].push(n);
        }

        let mut result = Vec::new();
        for freq in (1..buckets.len()).rev() { // highest frequency first
            for &n in &buckets[freq] {
                result.push(n);
                if result.len() == k as usize {
                    return result;
                }
            }
        }
        result
    }
}
