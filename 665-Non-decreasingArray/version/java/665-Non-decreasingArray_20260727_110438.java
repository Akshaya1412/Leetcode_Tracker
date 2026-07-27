// Last updated: 7/27/2026, 11:04:38 AM
1class Solution {
2    public boolean checkPossibility(int[] nums) {
3        int count=0;
4        for(int i=1;i<nums.length&&count<=1;i++){
5            if(nums[i-1]>nums[i]){
6                count++;
7                if(i-2<0||nums[i-2]<=nums[i]){
8                    nums[i-1]=nums[i];
9                }
10                else{
11                    nums[i]=nums[i-1];
12                }
13            }
14        }
15        return count<=1;
16    }
17}