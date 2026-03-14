class Solution {
    public int numWaterBottles(int numBottles, int numExchange) {
        int mxBottles = numBottles, div = 0;
        while( numBottles >= numExchange ) {
            div = numBottles / numExchange;
            mxBottles += div;
            numBottles = (numBottles % numExchange) + div;
        }
        return mxBottles;
    }
}