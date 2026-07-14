// Last updated: 14/07/2026, 16:03:42
import java.util.*;

class Solution {
    public String frequencySort(String s) {
        Map<Character, Integer> freq = new HashMap<>();

        // Count frequencies
        for (char c : s.toCharArray()) {
            freq.put(c, freq.getOrDefault(c, 0) + 1);
        }

        // Sort characters by frequency
        List<Character> chars = new ArrayList<>(freq.keySet());
        chars.sort((a, b) -> freq.get(b) - freq.get(a));

        StringBuilder result = new StringBuilder();

        // Build the result string
        for (char c : chars) {
            int count = freq.get(c);
            while (count-- > 0) {
                result.append(c);
            }
        }

        return result.toString();
    }
}