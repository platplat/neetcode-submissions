class Solution {
    public boolean hasDuplicate(int[] nums) {

        Map<Integer,Integer> numberCount = new HashMap<>();

        for (int num: nums) {
            if (numberCount.get(num) == null) {
                numberCount.put(num, 0);
            } else {
                return true;
            }
        }
        return false;
    }
}