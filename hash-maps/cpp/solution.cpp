#include <iostream>
#include <unordered_map>
using namespace std;

int main() {
    unordered_map<int, int> seen;  // hash map: key -> value

    seen[20] = 1;  // store 20 -> 1
    seen[30] = 2;  // store 30 -> 2

    cout << seen[20] << endl;                              // lookup 20 -> 1 (average O(1))
    cout << (seen.count(30) ? "true" : "false") << endl;   // key exists? -> true
    cout << (seen.count(99) ? seen[99] : -1) << endl;      // missing key -> -1
    return 0;
}
