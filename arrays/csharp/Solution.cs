using System;

class ArraysDemo {
    static int LinearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.Length; i++) {
            if (arr[i] == target) {
                return i;  // found: return its index
            }
        }
        return -1;  // not found
    }

    static void Main() {
        int[] arr = { 10, 20, 30, 40 };

        Console.WriteLine(arr[2]);                  // access by index -> 30 (O(1))
        Console.WriteLine(LinearSearch(arr, 40));   // linear search   -> 3  (O(n))
    }
}
