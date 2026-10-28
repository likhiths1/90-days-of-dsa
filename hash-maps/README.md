# Day 03 — Hash Maps Explained

A hash map stores **key → value** pairs.

| Key | Value |
|-----|-------|
| 20  | 1     |
| 30  | 2     |

| Operation | Example | Time |
|-----------|---------|------|
| Lookup by key | `seen[20]` → `1` | **O(1) average**, O(n) worst case (collisions) |

Each folder has a complete program that stores `20 → 1` and `30 → 2`, looks up key `20` (prints `1`), checks that key `30` exists (prints true), and handles a missing key (prints `-1`).

This is exactly the idea behind [Day 01 — Two Sum](../Day-01-Two-Sum).

## Practice on LeetCode
- #217 Contains Duplicate
- #242 Valid Anagram
