class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>>mp = new HashMap<>();
        for(String s : strs) {
            char arr[] = s.toCharArray();
            Arrays.sort(arr);
            String sortedArr = new String(arr);

            if(!mp.containsKey(sortedArr)) {
                mp.put(sortedArr, new LinkedList<String>());
            }
            mp.get(sortedArr).add(s);
        }
        return new LinkedList<>(mp.values());
    }
}
