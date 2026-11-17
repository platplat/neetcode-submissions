class Solution {
    public boolean isValid(String s) {
        // Create Stack to open brackets
        Stack<Character> st = new Stack<>();

        // Iterate over the string
        for (int i = 0; i < s.length(); i++) {

            // If the current char is an open bracket, push to stack
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                st.push(s.charAt(i));
                continue;
            }

            // If stack is empty, return false
            if (st.isEmpty()) {
                return false;
            }

            // If the current char is a closing bracket, check if last addded is matching and if so, pop
            if (s.charAt(i) == ')' && st.getLast() == '(') {
                st.pop();
                continue;
            }
            if (s.charAt(i) == ']' && st.getLast() == '[') {
                st.pop();
                continue;
            }
            if (s.charAt(i) == '}' && st.getLast() == '{') {
                st.pop();
                continue;
            }

            return false;
        }

        // If stack is empty, all brackets have been closed
        return st.isEmpty();
    }
}
