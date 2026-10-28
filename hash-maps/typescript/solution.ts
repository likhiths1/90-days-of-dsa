const seen = new Map<number, number>();  // hash map: key -> value

seen.set(20, 1);  // store 20 -> 1
seen.set(30, 2);  // store 30 -> 2

console.log(seen.get(20));         // lookup 20 -> 1 (average O(1))
console.log(seen.has(30));         // key exists? -> true
console.log(seen.get(99) ?? -1);   // missing key -> -1
