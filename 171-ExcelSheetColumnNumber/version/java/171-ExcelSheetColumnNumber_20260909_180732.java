// Last updated: 9/9/2026, 6:07:32 PM
1class Solution {
2    public int titleToNumber(String columnTitle) {
3        int result=0;
4        for(int i=0;i<columnTitle.length();i++){
5            int value=columnTitle.charAt(i)-'A'+1;
6            result=result*26+value;
7        }
8        return result;
9    }
10}