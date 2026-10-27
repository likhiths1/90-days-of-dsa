function linearSearch(arr, target) {
    for (let i = 0; i < arr.length; i++) {
        if (arr[i] === target) {
            return i;  // found: return its index
        }
    }
    return -1;  // not found
}

const arr = [10, 20, 30, 40];

console.log(arr[2]);                  // access by index -> 30 (O(1))
console.log(linearSearch(arr, 40));   // linear search   -> 3  (O(n))
