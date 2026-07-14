// Last updated: 14/07/2026, 16:06:12
public class Solution {
    public int removeElement(int[] nums, int val) {
        int k = 0; // Counter for elements not equal to val

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[k] = nums[i]; // Place non-val element at the front
                k++;
            }
        }
        return k;
    }
}
