// Last updated: 14/07/2026, 16:05:27
class Solution {
    public int climbStairs(int n) {
        if(n<=2) return n;
        int a = 1,b = 2;
        for(int i = 3;i<=n;i++){
            int c = a+b;
            a=b;
            b=c;
        }
        return b;
    }
}