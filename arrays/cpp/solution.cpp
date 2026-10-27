#include <iostream>
#include <vector>
using namespace std;

int linearSearch(const vector<int>& arr, int target) {
    for (int i = 0; i < (int)arr.size(); i++) {
        if (arr[i] == target) {
            return i;  // found: return its index
        }
    }
    return -1;  // not found
}

int main() {
    vector<int> arr = {10, 20, 30, 40};

    cout << arr[2] << endl;                 // access by index -> 30 (O(1))
    cout << linearSearch(arr, 40) << endl;  // linear search   -> 3  (O(n))
    return 0;
}
