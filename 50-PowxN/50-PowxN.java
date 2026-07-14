// Last updated: 14/07/2026, 16:05:39
class Solution {
    public double myPow(double x, int n) {
        long power = n;
        
        if (power < 0) {
            x = 1 / x;
            power = -power;
        }

        double result = 1.0;

        while (power > 0) {
            if ((power & 1) == 1) {
                result *= x;
            }
            x *= x;
            power >>= 1;
        }

        return result;
    }
}