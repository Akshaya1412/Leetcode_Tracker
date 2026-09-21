// Last updated: 9/21/2026, 2:26:26 PM
class Solution {
    public boolean checkDivisibility(int n) {
        int temp=n;
        int sum=0;
        int pro=1;
        while(n!=0){
            int d=n%10;
            sum+=d;
            pro*=d;
            n=n/10;
        }
        int total=sum+pro;
        return temp%total==0;
    }
}