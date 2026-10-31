bool isAnagram(char* s, char* t) {
    int count[26] = {0};  // frequency counter for 'a'..'z'
    int i = 0, j = 0;
    for (; s[i] != '\0'; i++) count[s[i] - 'a']++;
    for (; t[j] != '\0'; j++) count[t[j] - 'a']--;
    if (i != j) return false;
    for (int k = 0; k < 26; k++) {
        if (count[k] != 0) return false;
    }
    return true;
}
