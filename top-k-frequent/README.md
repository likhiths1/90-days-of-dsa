# Day 08 — Top K Frequent Elements (LeetCode #347)

**Question:** given an array of numbers and `k`, return the `k` most frequent numbers.

**Idea (hash map + bucket sort):**
1. Count how often each number appears with a hash map.
2. Create buckets where the **bucket index is the frequency**. Each number goes into the bucket matching its count (this is bucket sort, not comparison sorting).
3. Scan the buckets from the highest frequency to the lowest, collecting numbers until you have `k` of them.

```
nums = [1, 1, 1, 2, 2, 3],  k = 2

counts:   1 -> 3,  2 -> 2,  3 -> 1

buckets:  freq 1 -> [3]
          freq 2 -> [2]
          freq 3 -> [1]

scan from freq 3 down:  [1]  then  [2]  -> stop (collected 2)
result = [1, 2]
```

| Complexity | |
|---|---|
| Time | O(n) — one pass to count, one pass to fill the buckets, one scan over at most n + 1 buckets |
| Space | O(n) — the count map and the buckets |

LeetCode accepts the answer in any order. C is skipped because it has no built-in hash map.
