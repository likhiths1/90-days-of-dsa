int* productExceptSelf(int* nums, int numsSize, int* returnSize) {
    int* result = (int*)malloc(numsSize * sizeof(int));
    *returnSize = numsSize;

    int prefix = 1;                  // pass 1: left -> right
    for (int i = 0; i < numsSize; i++) {
        result[i] = prefix;          // product of everything before i
        prefix *= nums[i];
    }

    int suffix = 1;                  // pass 2: right -> left
    for (int i = numsSize - 1; i >= 0; i--) {
        result[i] *= suffix;         // prefix x product of everything after i
        suffix *= nums[i];
    }
    return result;
}
