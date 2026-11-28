class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int max = 0;
        int current = 0;

        for (int n: nums) {
            if (n == 1) {
                current++;
            }
            if (current > max) {
                max = current;
            }
            if (n == 0) {
                current = 0;
            }
        }

        return max;
    }
}