public class ArraysDemo {
    static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;  // found: return its index
            }
        }
        return -1;  // not found
    }

    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40};

        System.out.println(arr[2]);                 // access by index -> 30 (O(1))
        System.out.println(linearSearch(arr, 40));  // linear search   -> 3  (O(n))
    }
}
