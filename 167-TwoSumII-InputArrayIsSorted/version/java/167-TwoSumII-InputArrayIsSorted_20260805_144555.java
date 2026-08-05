// Last updated: 8/5/2026, 2:45:55 PM
1class Solution {
2    public int[] twoSum(int[] nums, int target) {
3        int l=0,r=nums.length-1;
4        while(nums[l]+nums[r]!=target){
5            if(nums[l]+nums[r]<target){
6                l++;
7            }
8            else{
9                r--;
10            }
11        }
12        return new int[]{l+1,r+1};
13    }
14}