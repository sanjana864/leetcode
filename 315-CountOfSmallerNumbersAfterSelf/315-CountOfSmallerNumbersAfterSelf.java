// Last updated: 14/07/2026, 16:03:26
import java.util.*;

class Solution {
    private int[] counts;
    private int[] indexes;
    private int[] tempIndexes;
    private int[] nums;

    public List<Integer> countSmaller(int[] nums) {
        int n = nums.length;
        this.nums = nums;
        counts = new int[n];
        indexes = new int[n];
        tempIndexes = new int[n];

        for (int i = 0; i < n; i++) {
            indexes[i] = i;
        }

        mergeSort(0, n - 1);

        List<Integer> result = new ArrayList<>();
        for (int count : counts) {
            result.add(count);
        }
        return result;
    }

    private void mergeSort(int left, int right) {
        if (left >= right) return;

        int mid = left + (right - left) / 2;

        mergeSort(left, mid);
        mergeSort(mid + 1, right);

        merge(left, mid, right);
    }

    private void merge(int left, int mid, int right) {
        int i = left;
        int j = mid + 1;
        int k = left;

        while (i <= mid && j <= right) {
            if (nums[indexes[i]] <= nums[indexes[j]]) {
                counts[indexes[i]] += (j - mid - 1);
                tempIndexes[k++] = indexes[i++];
            } else {
                tempIndexes[k++] = indexes[j++];
            }
        }

        while (i <= mid) {
            counts[indexes[i]] += (j - mid - 1);
            tempIndexes[k++] = indexes[i++];
        }

        while (j <= right) {
            tempIndexes[k++] = indexes[j++];
        }

        for (i = left; i <= right; i++) {
            indexes[i] = tempIndexes[i];
        }
    }
}