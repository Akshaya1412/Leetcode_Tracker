// Last updated: 9/28/2026, 12:13:23 PM
1class Solution {
2    public String toHex(int num) {
3       char[] hexDigits={'0','1','2','3','4','5','6','7','8','9','a','b','c','d','e','f'};
4       long k=num;
5       if(num<0) k=(1L<<32)+k;
6       if(k==0) return "0";
7       StringBuilder ans=new StringBuilder();
8       while(k!=0){
9        int rem=(int)(k%16);
10        k/=16;
11        ans.append(hexDigits[rem]);
12       } 
13       return ans.reverse().toString();
14    }
15}