// Last updated: 8/28/2026, 12:02:53 PM
1class Solution {
2    public boolean checkSubarraySum(int[] nums, int k) {
3        Map<Integer,Integer> map=new HashMap<>(){{put(0,-1);}};;
4        int runningsum=0;
5        for(int i=0;i<nums.length;i++){
6            runningsum+=nums[i];
7            if(k!=0) runningsum%=k;
8            Integer prev=map.get(runningsum);
9            if(prev!=null){
10                if(i-prev>1) return true;
11            }
12            else map.put(runningsum,i);
13        }
14        return false;
15    }
16}