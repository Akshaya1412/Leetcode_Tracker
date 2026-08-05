// Last updated: 8/5/2026, 3:21:15 PM
1class Solution {
2    int res=0;
3    public int countArrangement(int n) {
4        if(n==0)
5            return 0;
6        backtrack(1,n,new int[n+1]);
7        return res;
8        
9    }
10    private void backtrack(int pos,int n,int[] usedValueArr){
11        if(pos>n){
12            res++;
13            return;
14        }
15        for(int i=1;i<=n;i++){
16            if(usedValueArr[i]==0&&(pos%i==0||i%pos==0)){
17                usedValueArr[i]=1;
18                backtrack(pos+1,n,usedValueArr);
19                usedValueArr[i]=0;
20            }
21        }
22    }
23}