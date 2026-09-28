// Last updated: 9/28/2026, 11:28:54 AM
1class Solution {
2    public int maxEqualFreq(int[] nums) {
3        Map<Integer,Integer> countMap=new HashMap<>();
4        Map<Integer,Integer> freqMap=new HashMap<>();
5        int res=0;
6        for(int i=0;i<nums.length;i++){
7            countMap.put(nums[i],countMap.getOrDefault(nums[i],0)+1);
8            int freq=countMap.get(nums[i]);
9            freqMap.put(freq,freqMap.getOrDefault(freq,0)+1);
10            int count=freqMap.get(freq)*freq;
11            if(count==i+1&&i!=nums.length-1){
12                res=Math.max(res,i+2);
13            }
14            else if(count==i){
15                res=Math.max(res,i+1);
16            }
17        }
18        return res;
19    }
20}