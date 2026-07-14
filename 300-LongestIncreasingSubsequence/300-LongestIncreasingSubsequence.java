// Last updated: 7/14/2026, 2:17:51 PM
class Solution {
    public int lengthOfLIS(int[] nums) {
        int n = nums.length;
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = 1;
        }
        int maxlen = 1;
        for (int i = 1; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    a[i] = Math.max(a[i], a[j] + 1);
                }
            }
            maxlen = Math.max(maxlen, a[i]);
        }
        return maxlen;

    }
}