class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, ArrayList<String>> anagrams = new HashMap<>();

        for (String str: strs) {
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String sortedStr = String.valueOf(charArray);

            if ( !(anagrams.containsKey(sortedStr)) ) {
                anagrams.put(sortedStr, new ArrayList<>());
            }
            anagrams.get(sortedStr).add(str);
        }

        List<List<String>> output = new ArrayList<>();

        for (ArrayList<String> list: anagrams.values()) {
            output.add(list);
        }
        return output;
    }
}
