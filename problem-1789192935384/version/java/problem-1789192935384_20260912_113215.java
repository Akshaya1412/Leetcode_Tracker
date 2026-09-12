// Last updated: 9/12/2026, 11:32:15 AM
1class Solution {
2    public int numberOfSubarrays(int[] nums, int k) {
3        int n=nums.length;
4        int[] count=new int[n+1];
5        count[0]=1;
6        int ans=0,t=0;
7        for(int v:nums){
8            t+=v&1;
9            if(t-k>=0){
10                ans+=count[t-k];
11            }
12            count[t]++;
13        }
14        return ans;
15    }
16}