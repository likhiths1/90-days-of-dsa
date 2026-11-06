function productExceptSelf(nums: number[]): number[] {
    const n = nums.length;
    const result: number[] = new Array(n).fill(1);

    let prefix = 1;                  // pass 1: left -> right
    for (let i = 0; i < n; i++) {
        result[i] = prefix;          // product of everything before i
        prefix *= nums[i];
    }

    let suffix = 1;                  // pass 2: right -> left
    for (let i = n - 1; i >= 0; i--) {
        result[i] *= suffix;         // prefix x product of everything after i
        suffix *= nums[i];
    }
    return result;
}
