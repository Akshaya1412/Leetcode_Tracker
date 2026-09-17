// Last updated: 9/17/2026, 2:25:03 PM
1class Solution {
2    public int distributeCandies(int[] candyType) {
3        Arrays.sort(candyType);
4        int count=1;
5        for(int i=1;i<candyType.length;i++){
6            if(candyType[i]!=candyType[i-1]){
7                count++;
8            }
9        }
10        if(count<candyType.length/2){
11            return count;
12        }
13        else{
14            return candyType.length/2;
15        }
16    }
17}