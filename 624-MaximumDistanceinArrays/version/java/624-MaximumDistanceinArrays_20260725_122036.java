// Last updated: 7/25/2026, 12:20:36 PM
1class Solution {
2    public int maxDistance(List<List<Integer>> arrays) {
3        int globalMin=arrays.get(0).get(0);
4        int globalMax=arrays.get(0).get(arrays.get(0).size()-1);
5        int result=0;
6        for(int i=1;i<arrays.size();i++){
7            List<Integer> curr=arrays.get(i);
8            int localMin=curr.get(0);
9            int localMax=curr.get(curr.size()-1);
10            result=Math.max(result,Math.max(localMax-globalMin,globalMax-localMin));
11            globalMin=Math.min(globalMin,localMin);
12            globalMax=Math.max(globalMax,localMax);
13        }
14        return result;
15    }
16}