public class Solution {
    public IList<IList<string>> GroupAnagrams(string[] strs) {
        var groups = new Dictionary<string, IList<string>>();  // sorted word -> words
        foreach (string word in strs) {
            char[] chars = word.ToCharArray();
            Array.Sort(chars);
            string key = new string(chars);
            if (!groups.ContainsKey(key)) {
                groups[key] = new List<string>();
            }
            groups[key].Add(word);
        }
        return new List<IList<string>>(groups.Values);
    }
}
