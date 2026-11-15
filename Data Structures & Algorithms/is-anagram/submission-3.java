class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }

        return getFreq(s).equals(getFreq(t));
    }

    public static Map<Character, Integer> getFreq(String str) {
        Map<Character, Integer> frequency = new HashMap<>();
        for (char c: str.toCharArray()) {
            if (frequency.containsKey(c)) {
                frequency.put(c, frequency.get(c) + 1);
            } else {
                frequency.put(c, 1);
            }
        }
        return frequency;
    }
}
