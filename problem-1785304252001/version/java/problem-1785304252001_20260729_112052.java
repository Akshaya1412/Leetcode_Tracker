// Last updated: 7/29/2026, 11:20:52 AM
1class Solution {
2    public int minMoves(int[] nums) {
3        int i=0;
4        int min=nums[0];
5        int res=0;
6        for(i=0;i<nums.length;i++){
7            if(nums[i]<min){
8                min=nums[i];
9            }
10        }
11        for(i=0;i<nums.length;i++){
12            res=res+nums[i]-min;
13        }
14        return res;
15    }
16}