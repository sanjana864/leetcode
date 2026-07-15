// Last updated: 15/07/2026, 14:36:37
1class Solution {
2    public int lengthOfLastWord(String s) {
3        s = s.trim();
4        
5        int length = 0;
6        for (int i = s.length() - 1; i >= 0; i--) {
7            if (s.charAt(i) != ' ') {
8                length++;
9            }
10            else if (length > 0) {
11                break;
12            }
13        }
14        
15        return length;
16    }
17}