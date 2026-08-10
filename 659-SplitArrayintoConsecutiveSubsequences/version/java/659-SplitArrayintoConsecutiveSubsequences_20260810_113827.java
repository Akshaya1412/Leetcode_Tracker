// Last updated: 8/10/2026, 11:38:27 AM
1class Solution {
2    public boolean isPossible(int[] nums) {
3        HashMap<Integer, Integer> freq = new HashMap<>();
4        int mn = nums[0], mx = nums[0];
5
6        for (int x : nums) {
7            freq.put(x, freq.getOrDefault(x, 0) + 1);
8            mn = Math.min(mn, x);
9            mx = Math.max(mx, x);
10        }
11
12        int a = 0, b = 0, c = 0;
13
14        for (int i = mn; i <= mx + 1; i++) {
15            int f = freq.getOrDefault(i, 0);
16            if (f < a + b) return false;
17            int old = a;
18            a = Math.max(0, f - a - b - c);
19            b = old;
20            c = f - a - b;
21        }
22
23        return true;
24    }
25}