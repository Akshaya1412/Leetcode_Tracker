// Last updated: 8/4/2026, 12:14:00 PM
1class Solution {
2    public int minFlipsMonoIncr(String s) {
3        int ans=0,noflip=0;
4        for(int i=0;i<s.length();i++){
5            if(s.charAt(i)=='0'){
6                ans=Math.min(noflip,ans+1);
7            }
8            else{
9                noflip++;
10            }
11        }
12        return ans;
13    }
14}