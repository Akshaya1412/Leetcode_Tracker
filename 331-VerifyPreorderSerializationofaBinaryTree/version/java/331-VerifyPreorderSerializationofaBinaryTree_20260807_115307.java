// Last updated: 8/7/2026, 11:53:07 AM
1class Solution {
2    int n;
3    public boolean circularArrayLoop(int[] nums) {
4        n = nums.length;
5        for (int i = 0; i < nums.length; i++) {
6            Set<Integer> set = new HashSet<>();
7            boolean isForward=(nums[i]>=0);
8            if (dfs(i, nums, set,isForward)) {
9                return true;
10            }
11        }
12        return false;
13    }
14
15    public boolean dfs(int si, int nums[], Set<Integer> set,boolean isForward) {
16        if(si<0 || si>=nums.length) return false;
17        if(nums[si]<0 && isForward==true) return false;
18        if(nums[si]>=0 && isForward==false) return false; 
19        int index=(nums[si]+si)%n;
20        if(index<0){
21            index=n+index;
22        }
23        if(index==si) return false;
24        if(set.contains(index)) return true;
25        set.add(index);
26        if(dfs(index,nums,set,isForward)){
27            return true;
28        }
29        return false;
30    }
31}