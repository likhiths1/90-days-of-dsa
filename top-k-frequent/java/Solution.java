class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();  // number -> how many times it appears
        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];  // index = frequency
        for (int freq = 0; freq < buckets.length; freq++) {
            buckets[freq] = new ArrayList<>();
        }
        for (Map.Entry<Integer, Integer> e : count.entrySet()) {
            buckets[e.getValue()].add(e.getKey());
        }

        int[] result = new int[k];
        int idx = 0;
        for (int freq = buckets.length - 1; freq >= 1; freq--) {  // highest frequency first
            for (int n : buckets[freq]) {
                result[idx++] = n;
                if (idx == k) return result;
            }
        }
        return result;
    }
}
