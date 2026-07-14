// Last updated: 7/14/2026, 2:18:05 PM
class Solution {
    public int singleNumber(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            index=index^nums[i];
        }
        return index;
    }
}