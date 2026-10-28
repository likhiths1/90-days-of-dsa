seen = {}  # hash map: key -> value

seen[20] = 1  # store 20 -> 1
seen[30] = 2  # store 30 -> 2

print(seen[20])           # lookup 20 -> 1  (average O(1))
print(30 in seen)         # key exists? -> True
print(seen.get(99, -1))   # missing key -> -1
