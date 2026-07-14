// Last updated: 7/14/2026, 2:17:07 PM
class Solution {
    public boolean isSameAfterReversals(int num) {
        int q=num;
        int rev=0;
        while(num!=0)
        {
            int d=num%10;
            rev=rev*10+d;
            num=num/10;
        }
        int rev2=0;
        while(rev!=0)
        {
            int p=rev%10;
            rev2=rev2*10+p;
            rev=rev/10;
        }
        if(q==rev2)
        return true;
        else
        return false;
        
    }
}