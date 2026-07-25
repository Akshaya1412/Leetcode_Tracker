// Last updated: 7/25/2026, 11:25:18 AM
1class Solution {
2    public int longestMountain(int[] arr) {
3        int n=arr.length;
4        if(n<3){
5            return 0;
6        }
7        int maxlen=0;
8        for(int i=1;i<n-1;i++){
9            if(arr[i]>arr[i+1]&&arr[i]>arr[i-1]){
10                int left=i-1;
11                int right=i+1;
12                while(left>0&&arr[left]>arr[left-1]){
13                    left--;
14                }
15                while(right<n-1&&arr[right+1]<arr[right]){
16                    right++;
17                }
18                maxlen=Math.max(maxlen,right-left+1);
19                i=right;
20            }
21        }
22        return maxlen;
23    }
24}