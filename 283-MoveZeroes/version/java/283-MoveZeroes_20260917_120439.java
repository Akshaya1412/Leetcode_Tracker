// Last updated: 9/17/2026, 12:04:39 PM
1class Solution {
2    public void moveZeroes(int[] nums) {
3        int index=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]!=0){
6                nums[index]=nums[i];
7                index++;
8            }
9        }
10        while(index<nums.length){
11            nums[index]=0;
12            index++;
13        }
14    }
15}