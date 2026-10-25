use std::collections::HashMap;

impl Solution {
    pub fn two_sum(nums: Vec<i32>, target: i32) -> Vec<i32> {
        let mut seen: HashMap<i32, i32> = HashMap::new(); // number -> index
        for (i, &n) in nums.iter().enumerate() {
            let need = target - n;
            if let Some(&j) = seen.get(&need) {
                return vec![j, i as i32];
            }
            seen.insert(n, i as i32);
        }
        vec![]
    }
}
