// Last updated: 7/25/2026, 10:59:04 AM
1class Solution {
2    public int maxProduct(int n) {
3        int max1=-1,max2=-1;
4        while(n>0){
5            int digit=n%10;
6            if(digit>=max1){
7                max2=max1;
8                max1=digit;
9            }
10            else if(digit>max2){
11                max2=digit;
12            }
13            n/=10;
14        }
15        return max1*max2;
16    }
17}