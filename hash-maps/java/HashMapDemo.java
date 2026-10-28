import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Integer, Integer> seen = new HashMap<>();  // hash map: key -> value

        seen.put(20, 1);  // store 20 -> 1
        seen.put(30, 2);  // store 30 -> 2

        System.out.println(seen.get(20));                // lookup 20 -> 1 (average O(1))
        System.out.println(seen.containsKey(30));        // key exists? -> true
        System.out.println(seen.getOrDefault(99, -1));   // missing key -> -1
    }
}
