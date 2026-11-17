class Solution {
    public boolean isPalindrome(String s) {
        // Two pointers that point to index of start and end of string
        int left = 0;
        int right = s.length()-1;

        // While the pointers have not met in the middle
        while (left < right) {

            // if not a letter or digit, go to next letter
            while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
                left++;
            }
            while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
                right--;
            }

            // if the characters are not equal, return false
            if (Character.toLowerCase(s.charAt(left)) != Character.toLowerCase(s.charAt(right))) {
                return false;
            }

            // move pointers to next letter
            left++;
            right--;
        }

        // if all letters match, return true
        return true;   
    }
}
