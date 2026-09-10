// Last updated: 9/10/2026, 2:44:47 PM
1class Solution {
2    public int getMaxRepetitions(String s1, int n1, String s2, int n2) {
3        char[] ch1=s1.toCharArray();
4        char[] ch2=s2.toCharArray();
5        int i=0,j=0,count_s2=0;
6        while(n1>0){
7            if(ch1[i]==ch2[j]){
8                if(++j==ch2.length){
9                    j=0;
10                    count_s2++;
11                }
12            }
13            if(++i==ch1.length){
14                i=0;
15                n1--;
16            }
17        }
18        return count_s2/n2;
19    }
20}