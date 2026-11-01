class Solution:
    def groupAnagrams(self, strs: list[str]) -> list[list[str]]:
        groups = {}  # sorted word (key) -> list of words
        for word in strs:
            key = "".join(sorted(word))
            groups.setdefault(key, []).append(word)
        return list(groups.values())
