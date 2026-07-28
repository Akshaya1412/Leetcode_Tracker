// Last updated: 7/28/2026, 3:16:21 PM
1class Solution {
2    public int[] productExceptSelf(int[] nums) {
3        int n=nums.length;
4        int[] res=new int[n];
5        int pre=1;
6        for(int i=0;i<n;i++){
7            res[i]=pre;
8            pre*=nums[i];
9        }
10        int suf=1;
11        for(int i=n-1;i>=0;i--){
12            res[i]*=suf;
13            suf*=nums[i];
14        }
15        return res;
16    }
17}