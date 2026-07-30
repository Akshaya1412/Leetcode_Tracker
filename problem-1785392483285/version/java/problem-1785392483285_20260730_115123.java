// Last updated: 7/30/2026, 11:51:23 AM
1class Solution {
2    public String strWithout3a3b(int a, int b) {
3        StringBuilder sb=new StringBuilder();
4        while(a>0||b>0){
5            if(a>b){
6                if(a>=2){
7                    sb.append("aa");
8                    a-=2;
9                }
10                else{
11                    sb.append('a');
12                    a--;
13                }
14                if(b>0){
15                    sb.append("b");
16                    b--;
17                }
18            }
19            else if(b>a){
20                if(b>=2){
21                    sb.append("bb");
22                    b-=2;
23                }
24                else{
25                    sb.append("b");
26                    b--;
27                }
28                if(a>0){
29                    sb.append("a");
30                    a--;
31                }
32            }
33            else{
34                sb.append("ab");
35                a--;
36                b--;
37            }
38        }
39        return sb.toString();
40    }
41}