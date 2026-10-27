# Day 02 — Arrays Explained

An array stores elements in numbered slots. Indexing starts at **0**.

```
arr   = [10, 20, 30, 40]
index =   0   1   2   3
```

| Operation | Example | Time |
|-----------|---------|------|
| Access by index | `arr[2]` → `30` | **O(1)** — constant time, no scanning |
| Linear search | find `40` → index `3` | **O(n)** — may check every element |

Each folder contains a complete program that prints `30` (access by index) and the index of `40` (linear search; `3`, or `Some(3)` in Rust).

## Practice on LeetCode
- #1480 Running Sum of 1d Array
- #1929 Concatenation of Array
