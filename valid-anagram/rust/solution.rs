impl Solution {
    pub fn is_anagram(s: String, t: String) -> bool {
        if s.len() != t.len() {
            return false;
        }
        let mut count = [0i32; 26]; // frequency counter for 'a'..'z'
        for (a, b) in s.bytes().zip(t.bytes()) {
            count[(a - b'a') as usize] += 1;
            count[(b - b'a') as usize] -= 1;
        }
        count.iter().all(|&c| c == 0)
    }
}
