// Last updated: 7/28/2026, 2:57:24 PM
1class Solution {
2    public int arrayNesting(int[] nums) {
3        int ans=0;
4        for(int i=0;i<nums.length;i++){
5            if(nums[i]!=-1){
6                int j=i;
7                int count=0;
8                while(nums[j]!=-1){
9                    int k=nums[j];
10                    nums[j]=-1;
11                    j=k;
12                    count++;
13                }
14                ans=Math.max(ans,count);
15                if(ans==nums.length){
16                    return ans;
17                }
18            }
19        }
20            return ans;
21    }
22}