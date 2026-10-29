#include <stdio.h>

int linearSearchChecks(const int arr[], int n, int target) {
    int checks = 0;
    for (int i = 0; i < n; i++) {
        checks++;
        if (arr[i] == target) {
            return checks;
        }
    }
    return checks;
}

int main(void) {
    int small[] = {7, 3, 9, 1, 5};
    int big[] = {7, 3, 9, 1, 8, 2, 6, 4, 10, 5};

    printf("%d\n", linearSearchChecks(small, 5, 5));  // 5 checks  -> O(n)
    printf("%d\n", linearSearchChecks(big, 10, 5));   // 10 checks -> 2x the input, 2x the work

    printf("%d\n", small[3]);  // access by a known index -> 1 step -> O(1)
    printf("%d\n", big[9]);    // a bigger array, still 1 step
    return 0;
}
