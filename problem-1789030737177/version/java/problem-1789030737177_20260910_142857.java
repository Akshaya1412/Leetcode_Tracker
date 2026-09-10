// Last updated: 9/10/2026, 2:28:57 PM
1class Solution {
2    public String shortestPalindrome(String s) {
3        final String t=new StringBuilder(s).reverse().toString();
4        for(int i=0;i<t.length();i++){
5            if(s.startsWith(t.substring(i))){
6                return t.substring(0,i)+s;
7            }
8        }
9        return t+s;
10    }
11}