class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> set = new HashSet<>();
        int n = s.length();
        int l = 0, r = 0, ans = 0;
        while (l <= r && r < n) {
            if (!set.contains(s.charAt(r))) {
                set.add(s.charAt(r));
                ans = Math.max(ans, r - l + 1);
                r++;
            } else {
                while (set.contains(s.charAt(r))) {
                    set.remove(s.charAt(l));
                    l++;
                }
            }
        }
        return ans;
    }
}
