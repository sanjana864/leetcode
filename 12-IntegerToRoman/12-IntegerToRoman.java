// Last updated: 14/07/2026, 16:06:32
public class Solution {
    public String intToRoman(int num) {
        // Values and their corresponding Roman symbols
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {
            "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"
        };

        StringBuilder result = new StringBuilder();

        // Greedy approach: subtract largest possible value each time
        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                result.append(symbols[i]);
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.intToRoman(3749)); // MMMDCCXLIX
        System.out.println(sol.intToRoman(58));   // LVIII
        System.out.println(sol.intToRoman(1994)); // MCMXCIV
    }
}
