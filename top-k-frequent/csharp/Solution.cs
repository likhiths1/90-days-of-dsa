public class Solution {
    public int[] TopKFrequent(int[] nums, int k) {
        var count = new Dictionary<int, int>();  // number -> how many times it appears
        foreach (int n in nums) {
            count[n] = count.GetValueOrDefault(n, 0) + 1;
        }

        var buckets = new List<int>[nums.Length + 1];  // index = frequency
        for (int i = 0; i < buckets.Length; i++) {
            buckets[i] = new List<int>();
        }
        foreach (var entry in count) {
            buckets[entry.Value].Add(entry.Key);
        }

        var result = new List<int>();
        for (int freq = buckets.Length - 1; freq >= 1; freq--) {  // highest frequency first
            foreach (int n in buckets[freq]) {
                result.Add(n);
                if (result.Count == k) return result.ToArray();
            }
        }
        return result.ToArray();
    }
}
