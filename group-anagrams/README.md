# Day 07 — Group Anagrams (LeetCode #49)

**Question:** group all the anagrams in an array of words together.

**Idea (hash map with a sorted key):** sort each word alphabetically and use the sorted word as a key in a hash map. Every word with the same key belongs to the same group.

```
words = ["eat", "tea", "tan", "ate", "nat", "bat"]

eat -> aet     tea -> aet     tan -> ant
ate -> aet     nat -> ant     bat -> abt

aet -> ["eat", "tea", "ate"]
ant -> ["tan", "nat"]
abt -> ["bat"]

result = [["eat","tea","ate"], ["tan","nat"], ["bat"]]
```

| Complexity | |
|---|---|
| Time | O(n × k log k) — n words, each sorted (k = maximum word length) |
| Space | O(n × k) — all words are stored in the map |

LeetCode accepts the groups in any order. C is skipped because it has no built-in hash map.
