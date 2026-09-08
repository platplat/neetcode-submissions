class Solution {
    public void reverseString(char[] s) {

        int middle = (s.length - 1) / 2;
        
        for (int i = 0; i <= middle; i++) {
            int opposite = s.length - 1 - i;
            if (s[i] != s[opposite]) {
                // swap
                char temp = s[i];
                s[i] = s[opposite];
                s[opposite] = temp;
            }
        }
        System.out.println(s);
    }
}