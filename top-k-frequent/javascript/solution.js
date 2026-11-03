var topKFrequent = function (nums, k) {
    const count = new Map();  // number -> how many times it appears
    for (const n of nums) {
        count.set(n, (count.get(n) || 0) + 1);
    }

    const buckets = Array.from({ length: nums.length + 1 }, () => []);  // index = frequency
    for (const [n, freq] of count) {
        buckets[freq].push(n);
    }

    const result = [];
    for (let freq = buckets.length - 1; freq >= 1; freq--) {  // highest frequency first
        for (const n of buckets[freq]) {
            result.push(n);
            if (result.length === k) return result;
        }
    }
    return result;
};
