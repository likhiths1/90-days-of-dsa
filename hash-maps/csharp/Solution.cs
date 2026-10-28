using System;
using System.Collections.Generic;

class HashMapDemo {
    static void Main() {
        var seen = new Dictionary<int, int>();  // hash map: key -> value

        seen[20] = 1;  // store 20 -> 1
        seen[30] = 2;  // store 30 -> 2

        Console.WriteLine(seen[20]);                          // lookup 20 -> 1 (average O(1))
        Console.WriteLine(seen.ContainsKey(30));              // key exists? -> True
        Console.WriteLine(seen.GetValueOrDefault(99, -1));    // missing key -> -1
    }
}
