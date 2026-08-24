// Last updated: 8/24/2026, 12:24:39 PM
1class Solution {
2    public int sumOfUnique(int[] nums) {
3        int n=nums.length;
4        int sum=0;
5        for(int i=0;i<n;i++){
6            int c=0;
7            for(int j=0;j<n;j++){
8                if(nums[i]==nums[j]){
9                    c++;
10                }
11            }
12            if(c==1){
13                sum+=nums[i];
14            }
15        }
16        return sum;
17    }
18}