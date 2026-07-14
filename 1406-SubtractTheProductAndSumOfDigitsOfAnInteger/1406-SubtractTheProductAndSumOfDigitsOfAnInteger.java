// Last updated: 14/07/2026, 16:02:46
class Solution {
    public int subtractProductAndSum(int n) {
     int product = 1;
     int sum = 0;
     while(n>0){
        int digits = n%10;
        product *= digits;
        sum+=digits;
        n/=10;
     }   
     return product - sum;
    }
}