class Solution {
    public int longestConsecutive(int[] nums) {
        if (nums.length == 0) {
            return 0;
        }

        Set<Integer> numsSet = Arrays.stream(nums)
            .boxed()
            .collect(Collectors.toCollection(HashSet::new));
        
        int longest = 1;
        int current = 1;

        for (int num : nums) {
            if (!numsSet.contains(num-1)) {
                int start = num;
                while (numsSet.contains(start+1)) {
                    current++;
                    start++;
                }
                if (current > longest) {
                    longest = current;
                }
                current = 1;
            }
        }

        return longest;
    }
}
