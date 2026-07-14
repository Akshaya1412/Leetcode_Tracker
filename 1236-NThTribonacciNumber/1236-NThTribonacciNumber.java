// Last updated: 7/14/2026, 2:17:10 PM
class Solution {
    public int tribonacci(int n) {
        int f1=0,f2=1,f3=1,f4=0;
        if(n==0)
        {
            return 0;
        }
        if(n==1||n==2)
        {
            return 1;
        }
        for(int i=2;i<n;i++)
        {
            f4=f1+f2+f3;
            f1=f2;
            f2=f3;
            f3=f4;
        }
        return f4;
        
    }
}