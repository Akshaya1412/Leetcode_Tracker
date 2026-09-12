// Last updated: 9/12/2026, 11:57:36 AM
1class Solution {
2    public int maximumUniqueSubarray(int[] nums) {
3	Map<Integer, Integer> lastIndex = new HashMap<>();
4	int[] prefixSum = new int[nums.length + 1];
5
6	int maxScore = 0;
7	for (int l=0, r=0; r<nums.length; r++) {
8		prefixSum[r+1] = prefixSum[r] + nums[r];
9		if (lastIndex.containsKey(nums[r])) 
10			l = Math.max(l, lastIndex.get(nums[r]) + 1);
11		maxScore = Math.max(maxScore, prefixSum[r+1] - prefixSum[l]);
12		lastIndex.put(nums[r], r);
13	}
14
15	return maxScore;
16
17    }
18}