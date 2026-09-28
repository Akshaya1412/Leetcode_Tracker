// Last updated: 9/28/2026, 2:08:05 PM
1class Solution {
2    public List<Integer> findDisappearedNumbers(int[] nums) {
3        for(int i=0;i<nums.length;i++){
4            int idx=Math.abs(nums[i])-1;
5            if(nums[idx]>0){
6                nums[idx]*=-1;
7            }
8        }
9        List<Integer> result=new ArrayList<>();
10        for(int i=0;i<nums.length;i++){
11            if(nums[i]>0){
12                result.add(i+1);
13            }
14        }
15        return result;
16    }
17}