// Last updated: 7/14/2026, 2:16:58 PM
class Solution {
    public int numberOfCuts(int n) {
       if(n==1||n==0)
       return 0;
       int p=n/2;
       if(n%2==0)
       return p;
       else 
       return n; 
    }
}