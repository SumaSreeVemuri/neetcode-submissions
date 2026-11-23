
class Solution {

    public boolean match(int f1[], int f2[]) {
        for (int i = 0; i < 26; i++) {
            if (f1[i] != f2[i])
                return false;
        }
        return true;
    }

    public boolean checkInclusion(String s1, String s2) {

        int k = s1.length();

        if (k > s2.length())
            return false;

        int f1[] = new int[26];

        for (int i = 0; i < k; i++) {
            f1[s1.charAt(i) - 'a']++;
        }

        int f2[] = new int[26];

        int l = 0, r = 0;

        while (r < s2.length()) {

            f2[s2.charAt(r) - 'a']++;

            if (r - l + 1 == k) {

                if (match(f1, f2))
                    return true;

                f2[s2.charAt(l) - 'a']--;
                l++;
            }

            r++;
        }

        return false;
    }
}
