// Last updated: 7/14/2026, 2:17:54 PM
class Solution {
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        for(int i=nums.length-1;i>=0;i--){
            k--;
            if(k==0){
                return nums[i];
            }
        }
            return 0;
    }
}