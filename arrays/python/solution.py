def linear_search(arr, target):
    for i, value in enumerate(arr):
        if value == target:
            return i  # found: return its index
    return -1  # not found


arr = [10, 20, 30, 40]

print(arr[2])                   # access by index  -> 30 (O(1))
print(linear_search(arr, 40))   # linear search    -> 3  (O(n))
