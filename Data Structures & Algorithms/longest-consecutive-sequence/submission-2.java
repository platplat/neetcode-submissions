class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }
        
        int longest = 1;
        Arrays.sort(nums);

        int current = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i-1] == 1) {
                current++;
                if (current > longest) {longest = current;}
            } else if (nums[i] == nums[i-1]) {
                continue;
            } else {
                current = 1;
            }
        }

        return longest;
    }
}
