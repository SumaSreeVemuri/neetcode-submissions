class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> mp = new HashMap<>();
        for (int n : nums) {
            mp.put(n, mp.getOrDefault(n, 0) + 1);
        }
        int ans[] = new int[k];
        PriorityQueue<Map.Entry<Integer, Integer>> pq =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());
        pq.addAll(mp.entrySet());
        for (int i = 0; i < k; i++) {
            ans[i] = pq.poll().getKey();
        }
        return ans;
    }
}
