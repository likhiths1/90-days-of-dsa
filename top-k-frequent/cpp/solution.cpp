class Solution {
public:
    vector<int> topKFrequent(vector<int>& nums, int k) {
        unordered_map<int, int> count;  // number -> how many times it appears
        for (int n : nums) count[n]++;

        vector<vector<int>> buckets(nums.size() + 1);  // index = frequency
        for (auto& [n, freq] : count) buckets[freq].push_back(n);

        vector<int> result;
        for (int freq = (int)buckets.size() - 1; freq >= 1; freq--) {  // highest frequency first
            for (int n : buckets[freq]) {
                result.push_back(n);
                if ((int)result.size() == k) return result;
            }
        }
        return result;
    }
};
