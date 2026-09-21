// Last updated: 9/21/2026, 9:28:37 PM
class Solution {
    public void moveZeroes(int[] nums) {
        int index=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[index]=nums[i];
                index++;
            }
        }
        while(index<nums.length){
            nums[index]=0;
            index++;
        }
    }
}