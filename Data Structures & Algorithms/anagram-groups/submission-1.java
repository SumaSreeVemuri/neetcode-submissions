class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> mp = new HashMap<>();
        for (String s : strs) {
            int arr[] = new int[26];
            for (char c : s.toCharArray()) {
                arr[c - 'a']++;
            }
            StringBuilder key = new StringBuilder();
            char c = 'a';
            for (int i : arr) {
                if (i != 0) {
                    key.append(c);
                    key.append(i);
                }
                c++;
            }
            if (!mp.containsKey(key.toString())) {
                List<String> strList = new ArrayList<>();
                strList.add(s);
                mp.put(key.toString(), strList);
            } else {
                mp.get(key.toString()).add(s);
            }
        }
        return new ArrayList<>(mp.values());
    }
}
