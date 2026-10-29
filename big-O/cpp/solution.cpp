#include <iostream>
#include <vector>
using namespace std;

int linearSearchChecks(const vector<int>& arr, int target) {
    int checks = 0;
    for (int x : arr) {
        checks++;
        if (x == target) {
            return checks;
        }
    }
    return checks;
}

int main() {
    vector<int> small = {7, 3, 9, 1, 5};
    vector<int> big = {7, 3, 9, 1, 8, 2, 6, 4, 10, 5};

    cout << linearSearchChecks(small, 5) << endl;  // 5 checks  -> O(n)
    cout << linearSearchChecks(big, 5) << endl;    // 10 checks -> 2x the input, 2x the work

    cout << small[3] << endl;  // access by a known index -> 1 step -> O(1)
    cout << big[9] << endl;    // a bigger array, still 1 step
    return 0;
}
