class Solution {
    public boolean isAnagram(String s, String t) {
        int arr[] = new int[26];
        if(s.length()!=t.length()) return false;
        for(int i=0;i<s.length();i++){
            arr[s.charAt(i)-97] ++;
        }
        for(int i=0;i<t.length();i++) {
            if(arr[t.charAt(i)-97] == 0) return false;
            arr[t.charAt(i)-97]--;
        }
        return Arrays.stream(arr).allMatch(x->x==0);
        //return true;
    }
}
