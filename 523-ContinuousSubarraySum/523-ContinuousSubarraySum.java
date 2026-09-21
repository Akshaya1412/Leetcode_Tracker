// Last updated: 9/21/2026, 9:27:08 PM
class Solution {
    public boolean checkSubarraySum(int[] nums, int k) {
        Map<Integer,Integer> map=new HashMap<>(){{put(0,-1);}};;
        int runningsum=0;
        for(int i=0;i<nums.length;i++){
            runningsum+=nums[i];
            if(k!=0) runningsum%=k;
            Integer prev=map.get(runningsum);
            if(prev!=null){
                if(i-prev>1) return true;
            }
            else map.put(runningsum,i);
        }
        return false;
    }
}