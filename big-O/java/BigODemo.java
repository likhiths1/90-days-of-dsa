public class BigODemo {
    static int linearSearchChecks(int[] arr, int target) {
        int checks = 0;
        for (int x : arr) {
            checks++;
            if (x == target) {
                return checks;
            }
        }
        return checks;
    }

    public static void main(String[] args) {
        int[] small = {7, 3, 9, 1, 5};
        int[] big = {7, 3, 9, 1, 8, 2, 6, 4, 10, 5};

        System.out.println(linearSearchChecks(small, 5));  // 5 checks  -> O(n)
        System.out.println(linearSearchChecks(big, 5));    // 10 checks -> 2x the input, 2x the work

        System.out.println(small[3]);  // access by a known index -> 1 step -> O(1)
        System.out.println(big[9]);    // a bigger array, still 1 step
    }
}
