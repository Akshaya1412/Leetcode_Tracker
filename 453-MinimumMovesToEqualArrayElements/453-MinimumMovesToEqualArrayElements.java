// Last updated: 9/21/2026, 9:27:29 PM
class Solution {
    public int minMoves(int[] nums) {
        int i=0;
        int min=nums[0];
        int res=0;
        for(i=0;i<nums.length;i++){
            if(nums[i]<min){
                min=nums[i];
            }
        }
        for(i=0;i<nums.length;i++){
            res=res+nums[i]-min;
        }
        return res;
    }
}