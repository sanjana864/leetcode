// Last updated: 14/07/2026, 16:03:24
import java.util.*;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
    
        Map<Integer, Integer> freqMap = new HashMap<>();
        for (int num : nums) {
            freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
        }
        PriorityQueue<Map.Entry<Integer, Integer>> maxHeap =
            new PriorityQueue<>((a, b) -> b.getValue() - a.getValue());

        maxHeap.addAll(freqMap.entrySet());
        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = maxHeap.poll().getKey();
        }

        return result;
    }
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] nums1 = {1,1,1,2,2,3};
        int[] nums2 = {1};
        
        System.out.println(Arrays.toString(sol.topKFrequent(nums1, 2))); // [1, 2]
        System.out.println(Arrays.toString(sol.topKFrequent(nums2, 1))); // [1]
    }
}
