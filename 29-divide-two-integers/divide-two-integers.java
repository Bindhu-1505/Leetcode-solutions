import java.math.*;
class Solution {
    public int divide(int dividend, int divisor) {
        int quoteint=dividend/divisor;
        if(dividend==Integer.MIN_VALUE && divisor==-1)
        {
            return Integer.MAX_VALUE;
        }
        return quoteint;
    }
}