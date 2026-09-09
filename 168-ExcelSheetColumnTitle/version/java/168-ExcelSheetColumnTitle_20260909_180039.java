// Last updated: 9/9/2026, 6:00:39 PM
1class Solution {
2    public String convertToTitle(int columnNumber) {
3        String res="";
4        while(columnNumber>0){
5            columnNumber--;
6            int rem=columnNumber%26;
7            char ch=(char)('A'+rem);
8            res=ch+res;
9            columnNumber/=26;
10        }
11        return res;
12    }
13}