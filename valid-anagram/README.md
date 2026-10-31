# Day 06 — Valid Anagram (LeetCode #242)

**Question:** do two strings contain exactly the same characters with the same counts (order doesn't matter)?

**Idea (frequency counter):** count how many times each character appears in the first word, then do the same for the second word. If every character has the same frequency in both words, they're anagrams.

```
listen -> e:1 i:1 l:1 n:1 s:1 t:1
silent -> e:1 i:1 l:1 n:1 s:1 t:1   -> same counts -> true

rat -> a:1 r:1 t:1
car -> a:1 c:1 r:1                  -> counts differ -> false
```

The solutions use one counter array: add 1 for each character of `s` and subtract 1 for each character of `t`. If every count ends at 0, the two frequency maps matched. The Python version uses a dictionary.

| Complexity | |
|---|---|
| Time | O(n) — one pass over the strings |
| Space | O(1) for a fixed character set (26 lowercase letters) |

Examples: `("anagram","nagaram")` → `true`, `("rat","car")` → `false`.
