class Solution {
    public boolean isSubsequence(String s, String t) {

        // Create stack to store characters in s
        Stack<Character> charStack = new Stack<>();
        
        // Add the characters to the stack in reverse order
        for (int i = s.length() - 1; i >= 0; i--) {
            charStack.push(s.charAt(i));
        }

        // Iterate over the characters in t and compare to top of stack. pop() from stack if they equal
        for (int j = 0; j < t.length(); j++) {
            
            if (charStack.isEmpty()) {
                return true;
            }
            
            if (t.charAt(j) == charStack.peek()) {
                charStack.pop();
            }
        }

        // If all the characters have been popped from the stack, then s is a subsequence of t
        return charStack.isEmpty();
    }
}