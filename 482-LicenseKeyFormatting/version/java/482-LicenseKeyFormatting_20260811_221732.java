// Last updated: 8/11/2026, 10:17:32 PM
1class Solution {
2    public String licenseKeyFormatting(String s, int k) {
3        s=s.toUpperCase();
4        s=s.replaceAll("-","");
5        StringBuilder sb=new StringBuilder(s);
6        for(int i=s.length()-k;i>0;i=i-k){
7            sb.insert(i,"-");
8        }
9        return sb.toString();
10    }
11}