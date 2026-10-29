using System;

class BigODemo {
    static int LinearSearchChecks(int[] arr, int target) {
        int checks = 0;
        foreach (int x in arr) {
            checks++;
            if (x == target) {
                return checks;
            }
        }
        return checks;
    }

    static void Main() {
        int[] small = { 7, 3, 9, 1, 5 };
        int[] big = { 7, 3, 9, 1, 8, 2, 6, 4, 10, 5 };

        Console.WriteLine(LinearSearchChecks(small, 5));  // 5 checks  -> O(n)
        Console.WriteLine(LinearSearchChecks(big, 5));    // 10 checks -> 2x the input, 2x the work

        Console.WriteLine(small[3]);  // access by a known index -> 1 step -> O(1)
        Console.WriteLine(big[9]);    // a bigger array, still 1 step
    }
}
