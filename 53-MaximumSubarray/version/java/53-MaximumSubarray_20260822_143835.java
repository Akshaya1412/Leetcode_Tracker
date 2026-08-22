// Last updated: 8/22/2026, 2:38:35 PM
1class Solution {
2    public int maxSubArray(int[] nums) {
3        int ms=nums[0];
4        int cs=nums[0];
5        for(int i=1;i<nums.length;i++){
6            cs=Math.max(nums[i],cs+nums[i]);
7            ms=Math.max(ms,cs);
8        }
9        return ms;
10    }
11}