// Last updated: 9/21/2026, 9:25:26 PM
class Solution {
    public int partitionDisjoint(int[] a) {
        int len = a.length;
        if (len == 2)
            return 1;
        int[] minFromRight = new int[len];
        minFromRight[len-1] = a[len-1];
        for (int i = a.length-2; i > 0; i--) {
            minFromRight[i] = Math.min(minFromRight[i+1], a[i]);
        }
        int maxFromLeft = a[0];
        int j = 1;
        for ( ; j < len - 1; j++) {
            if (maxFromLeft <= minFromRight[j]) {
                break;
            }
            maxFromLeft = Math.max(maxFromLeft, a[j]);
        }
        return j;
    }
}