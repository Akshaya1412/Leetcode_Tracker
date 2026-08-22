// Last updated: 8/22/2026, 4:01:22 PM
1class Solution {
2    public int findKthPositive(int[] arr, int k) {
3        int left=0;
4        int right=arr.length-1;
5        while(left<=right){
6            int mid=left+(right-left)/2;
7            if(arr[mid]-mid-1<k){
8                left=mid+1;
9            }
10            else{
11                right=mid-1;
12            }
13        }
14        return left+k;
15
16    }
17}