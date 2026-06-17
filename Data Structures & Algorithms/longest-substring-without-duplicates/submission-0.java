class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int l = 0, r = 0, ans = 0;
        Map<Character, Boolean> mp = new HashMap<>();
        while (l <= r && r < n) {
            if (!mp.containsKey(s.charAt(r))) {
                mp.put(s.charAt(r), true);
                ans = Math.max(ans, r - l + 1);
                r++;
            } else {
                while (mp.containsKey(s.charAt(r))) {
                    mp.remove(s.charAt(l));
                    l++;
                }
            }
        }
        return ans;
    }
}
