// Last updated: 8/3/2026, 11:13:42 AM
1class Solution {
2    public int minimumDeleteSum(String s1, String s2) {
3        int m=s1.length(),n=s2.length();
4        int[][] dp=new int[m+1][n+1];
5        for(int i=m-1;i>=0;i--){
6            for(int j=n-1;j>=0;j--){
7                if(s1.charAt(i)==s2.charAt(j)){
8                    dp[i][j]=s1.charAt(i)+dp[i+1][j+1];
9                }
10                else{
11                    dp[i][j]=Math.max(dp[i+1][j],dp[i][j+1]);
12                }
13            }
14        }
15        int total=0;
16        for(char c:s1.toCharArray())
17        total+=c;
18        for(char c:s2.toCharArray())
19        total+=c;
20        return total-2*dp[0][0];
21    }
22}