// Last updated: 8/10/2026, 11:54:40 AM
1class Solution {
2    public int partitionDisjoint(int[] a) {
3        int len = a.length;
4        if (len == 2)
5            return 1;
6        int[] minFromRight = new int[len];
7        minFromRight[len-1] = a[len-1];
8        for (int i = a.length-2; i > 0; i--) {
9            minFromRight[i] = Math.min(minFromRight[i+1], a[i]);
10        }
11        int maxFromLeft = a[0];
12        int j = 1;
13        for ( ; j < len - 1; j++) {
14            if (maxFromLeft <= minFromRight[j]) {
15                break;
16            }
17            maxFromLeft = Math.max(maxFromLeft, a[j]);
18        }
19        return j;
20    }
21}