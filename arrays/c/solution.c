#include <stdio.h>

int linearSearch(const int arr[], int n, int target) {
    for (int i = 0; i < n; i++) {
        if (arr[i] == target) {
            return i;  // found: return its index
        }
    }
    return -1;  // not found
}

int main(void) {
    int arr[] = {10, 20, 30, 40};
    int n = sizeof(arr) / sizeof(arr[0]);

    printf("%d\n", arr[2]);                    // access by index -> 30 (O(1))
    printf("%d\n", linearSearch(arr, n, 40));  // linear search   -> 3  (O(n))
    return 0;
}
