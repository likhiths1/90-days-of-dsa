# Day 05 — Contains Duplicate (LeetCode #217)

**Question:** does any value appear at least twice in the array?

**Idea (hash set):** scan left to right. If the current number is already in the set, a duplicate exists — return `true`. Otherwise add it to the set and continue. The set stores each distinct value only once.

```
nums = [1, 2, 3, 1]
scan 1 -> add      seen = {1}
scan 2 -> add      seen = {1, 2}
scan 3 -> add      seen = {1, 2, 3}
scan 1 -> already in seen -> duplicate!  -> true
```

| Approach | Time | Extra space |
|----------|------|-------------|
| Brute force (compare every pair) | O(n²) | O(1) |
| Hash set | O(n) average | O(n) |

Examples: `[1,2,3,1]` → `true`, `[1,2,3,4]` → `false`, `[1,1,1,3,3,4,3,2,4,2]` → `true`.

Each language folder has a LeetCode-ready solution (C is skipped because it has no built-in hash set).
