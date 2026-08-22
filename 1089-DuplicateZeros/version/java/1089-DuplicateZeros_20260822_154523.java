// Last updated: 8/22/2026, 3:45:23 PM
1class Solution {
2    public void duplicateZeros(int[] arr) {
3        int length=arr.length;
4        for(int i=0;i<length;i++){
5            if(arr[i]==0&&i+1<length){
6                for(int j=length-1;j>i+1;j--){
7                    arr[j]=arr[j-1];
8                }
9                arr[i+1]=0;
10                i++;
11            }
12        }
13    }
14}