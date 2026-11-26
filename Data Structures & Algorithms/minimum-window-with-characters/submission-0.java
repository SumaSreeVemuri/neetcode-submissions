class Solution {
    public String minWindow(String s, String t) {
        Map<Character, Integer> mp = new HashMap<>();
        int tl = t.length();
        for (int i = 0; i < t.length(); i++) {
            char c = t.charAt(i);
            mp.put(c, mp.getOrDefault(c, 0) + 1);
        }
        int l = 0, r = 0, start = -1, minlen = Integer.MAX_VALUE, cnt = 0;
        int sl = s.length();
        while (r < sl) {
            char c = s.charAt(r);
            if (mp.getOrDefault(c, 0) > 0) {
                cnt++;
            }
            mp.put(c, mp.getOrDefault(c, 0) - 1);
            while (cnt == tl) {
                if (minlen > (r - l + 1)) {
                    start = l;
                    minlen = r - l + 1;
                }
                c = s.charAt(l);
                mp.put(c, mp.getOrDefault(c, 0) + 1);
                if (mp.getOrDefault(c, 0) > 0) {
                    cnt--;
                }
                l++;
            }
            r++;
        }
        return minlen == Integer.MAX_VALUE ? "" : s.substring(start, start + minlen);
    }
}
