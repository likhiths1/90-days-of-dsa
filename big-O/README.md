# Day 04 — Big O Notation Explained

Big O describes how an algorithm's resource use **grows** as the input size increases — not just how many seconds it takes on one computer.

| Operation | Example | Work as input grows |
|-----------|---------|---------------------|
| Linear scan | check every element one by one | **O(n)** — 2× the input, 2× the work |
| Access by known index | `arr[3]` | **O(1)** — constant work |

Each folder has a complete program that prints:

```
5    # linear scan of 5 elements  -> 5 checks
10   # linear scan of 10 elements -> 10 checks
1    # small[3]
5    # big[9]  (bigger array, still 1 step)
```

## Practice on LeetCode
- #136 Single Number
- #1480 Running Sum of 1d Array
