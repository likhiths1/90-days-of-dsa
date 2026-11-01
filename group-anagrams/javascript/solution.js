var groupAnagrams = function (strs) {
    const groups = new Map();  // sorted word -> words
    for (const word of strs) {
        const key = word.split("").sort().join("");
        if (!groups.has(key)) {
            groups.set(key, []);
        }
        groups.get(key).push(word);
    }
    return [...groups.values()];
};
