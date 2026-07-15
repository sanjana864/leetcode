// Last updated: 15/07/2026, 14:34:25
1class Solution {
2    public int[][] insert(int[][] intervals, int[] newInterval) {
3        List<int[]> result = new ArrayList<>();
4        int i = 0;
5        int n = intervals.length;
6
7        // Add all intervals before newInterval
8        while (i < n && intervals[i][1] < newInterval[0]) {
9            result.add(intervals[i]);
10            i++;
11        }
12
13        // Merge overlapping intervals
14        while (i < n && intervals[i][0] <= newInterval[1]) {
15            newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
16            newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
17            i++;
18        }
19        result.add(newInterval);
20
21        // Add remaining intervals
22        while (i < n) {
23            result.add(intervals[i]);
24            i++;
25        }
26
27        return result.toArray(new int[result.size()][]);
28    }
29}