function linearSearchChecks(arr, target) {
    let checks = 0;
    for (const x of arr) {
        checks++;
        if (x === target) {
            return checks;
        }
    }
    return checks;
}

const small = [7, 3, 9, 1, 5];
const big = [7, 3, 9, 1, 8, 2, 6, 4, 10, 5];

console.log(linearSearchChecks(small, 5));  // 5 checks  -> O(n)
console.log(linearSearchChecks(big, 5));    // 10 checks -> 2x the input, 2x the work

console.log(small[3]);  // access by a known index -> 1 step -> O(1)
console.log(big[9]);    // a bigger array, still 1 step
