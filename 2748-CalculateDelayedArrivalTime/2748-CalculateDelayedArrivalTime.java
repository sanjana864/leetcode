// Last updated: 14/07/2026, 16:02:34
class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {
        return(arrivalTime  + delayedTime)%24;
    }
}