class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int n : nums) {
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }
        int ans[] = new int[k];
        for (int i = 0; i < k; i++) {
            int maxFreq = -1;
            int maxElement = -1;
            for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
                if (entry.getValue() > maxFreq) {
                    maxFreq = entry.getValue();
                    maxElement = entry.getKey();
                }
            }
            ans[i] = maxElement;
            mp.remove(maxElement);
        }
        return ans;
    }
}
