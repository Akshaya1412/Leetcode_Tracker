// Last updated: 9/21/2026, 9:25:46 PM
class Solution {
    public int longestMountain(int[] arr) {
        int n=arr.length;
        if(n<3){
            return 0;
        }
        int maxlen=0;
        for(int i=1;i<n-1;i++){
            if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
                int left=i-1;
                int right=i+1;
                while(left>0&&arr[left]>arr[left-1]){
                    left--;
                }
                while(right<n-1&&arr[right+1]<arr[right]){
                    right++;
                }
                maxlen=Math.max(maxlen,right-left+1);
                i=right;
            }
        }
        return maxlen;
    }
}