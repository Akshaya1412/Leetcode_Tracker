// Last updated: 8/13/2026, 11:47:29 AM
1class Solution {
2    public int compareVersion(String version1, String version2) {
3        String[] v1=version1.split("\\.");
4        String[] v2=version2.split("\\.");
5        int len=Math.max(v1.length,v2.length);
6        for(int i=0;i<len;i++){
7            int num1=i<v1.length?Integer.parseInt(v1[i]):0;
8            int num2=i<v2.length?Integer.parseInt(v2[i]):0;
9            if(num1<num2) return -1;
10            if(num1>num2) return 1;
11        }
12        return 0;
13    }
14}