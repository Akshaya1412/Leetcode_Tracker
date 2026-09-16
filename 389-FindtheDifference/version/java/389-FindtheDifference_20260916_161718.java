// Last updated: 9/16/2026, 4:17:18 PM
1class Solution {
2    public char findTheDifference(String s, String t) {
3        char[] a=s.toCharArray();
4        char[] b=t.toCharArray();
5        Arrays.sort(a);
6        Arrays.sort(b);
7        for(int i=0;i<a.length;i++){
8            if(a[i]!=b[i]){
9                return b[i];
10            }
11        }
12        return b[b.length-1];
13    }
14}