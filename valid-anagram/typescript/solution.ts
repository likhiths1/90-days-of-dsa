function isAnagram(s: string, t: string): boolean {
    if (s.length !== t.length) return false;
    const count: number[] = new Array(26).fill(0);  // frequency counter for 'a'..'z'
    for (let i = 0; i < s.length; i++) {
        count[s.charCodeAt(i) - 97]++;
        count[t.charCodeAt(i) - 97]--;
    }
    return count.every((c) => c === 0);
}
