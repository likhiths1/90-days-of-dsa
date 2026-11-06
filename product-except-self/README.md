# Day 09 — Product of Array Except Self (LeetCode #238)

**Question:** return an array where `answer[i]` is the product of every element except `nums[i]`, **without using division**.

**Idea (prefix and suffix products):** each answer is the product of everything to the left of `i` times the product of everything to the right of `i`.

```
nums = [1, 2, 3, 4]

Pass 1 (left -> right) stores the prefix product (everything before i):
    result = [1, 1, 2, 6]

Pass 2 (right -> left) multiplies in a running suffix product (everything after i):
    i=3: 6 x 1  = 6      suffix = 1 x 4  = 4
    i=2: 2 x 4  = 8      suffix = 4 x 3  = 12
    i=1: 1 x 12 = 12     suffix = 12 x 2 = 24
    i=0: 1 x 24 = 24     suffix = 24 x 1 = 24

result = [24, 12, 8, 6]
```

| Complexity | |
|---|---|
| Time | O(n) — two passes over the array |
| Extra space | O(1) — the output array is not counted as extra space |

Examples: `[1,2,3,4]` -> `[24,12,8,6]`, `[-1,1,0,-3,3]` -> `[0,0,9,0,0]`.
