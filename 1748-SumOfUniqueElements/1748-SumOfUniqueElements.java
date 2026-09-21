// Last updated: 9/21/2026, 2:27:57 PM
class Solution {
    public int sumOfUnique(int[] nums) {
        int n=nums.length;
        int sum=0;
        for(int i=0;i<n;i++){
            int c=0;
            for(int j=0;j<n;j++){
                if(nums[i]==nums[j]){
                    c++;
                }
            }
            if(c==1){
                sum+=nums[i];
            }
        }
        return sum;
    }
}