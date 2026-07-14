// Last updated: 7/14/2026, 2:18:02 PM
class Solution {
    public int trailingZeroes(int n) {
        int r=0;
        while(n>0)
        {
            n/=5;
            r+=n;
        }
        return r;
    }
}