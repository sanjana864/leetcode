// Last updated: 14/07/2026, 16:03:46
class Solution {
    public int addDigits(int num) {
      if(num==0)  return 0;
   return 1+(num-1)% 9; 
    }
}