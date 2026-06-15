class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        int n = s.length();
        char arr[] = s.toCharArray();
        for (int i = 0; i < n; i++) {
            if (arr[i] == '(' || arr[i] == '{' || arr[i] == '[') {
                st.push(arr[i]);
            } else {
                if (st.isEmpty() || (arr[i] == ')' && st.peek() != '(')
                    || (arr[i] == '}' && st.peek() != '{') || (arr[i] == ']' && st.peek() != '[')) {
                    return false;
                }
                st.pop();
            }
        }
        return st.isEmpty();
    }
}
