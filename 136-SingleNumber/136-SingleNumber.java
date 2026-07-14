// Last updated: 14/07/2026, 16:05:01
class Solution {
    public int singleNumber(int[] nums) {
         
        int ans = 0;

        for (int num : nums) {
            ans ^= num;
        }

        return ans;
    }
}
  
    
