// Last updated: 9/16/2026, 4:05:27 PM
1class Solution {
2    public boolean isSubsequence(String s, String t) {
3        int sp=0;
4        int tp=0;
5        while(sp<s.length()&&tp<t.length()){
6            if(s.charAt(sp)==t.charAt(tp)){
7                sp++;
8
9            }
10            tp++;
11        }
12        return sp==s.length();
13    }
14}