// Last updated: 8/22/2026, 12:20:44 PM
1class Solution {
2    public boolean checkDivisibility(int n) {
3        int temp=n;
4        int sum=0;
5        int pro=1;
6        while(n!=0){
7            int d=n%10;
8            sum+=d;
9            pro*=d;
10            n=n/10;
11        }
12        int total=sum+pro;
13        return temp%total==0;
14    }
15}