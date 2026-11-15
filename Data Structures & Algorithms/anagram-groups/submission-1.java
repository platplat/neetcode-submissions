class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // Create hashmap to store frequency of letters and the strings
        Map<List<Integer>, List<String>> map = new HashMap<>();

        // Iterate over the strings array
        for (String s: strs) {
            // Create a new frequency list with 26 zeros (one for each letter)
            List<Integer> frequency = new ArrayList<>(Collections.nCopies(26,0));
            // Iterate over the characters of the string
            for (char c: s.toCharArray()) {
                // Get the index associated with the character (i.e. 'a' - 'a' == 0)
                int i = c - 'a';
                // Increment the number at this index to count the frequency
                frequency.set(i, frequency.get(i) + 1);
            }

            // If the map contains this frequency, add the string to the values list
            if (map.containsKey(frequency)) {
                List<String> existingFreq = map.get(frequency);
                existingFreq.add(s);
            } else {
                // If not, create a new list, add the string, and add it to map
                List<String> newFreq = new ArrayList<>();
                newFreq.add(s);
                map.put(frequency, newFreq);
            }
        }

        // Return the list of the grouped strings
        return new ArrayList<>(map.values());
    }
}
