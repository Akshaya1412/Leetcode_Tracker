// Last updated: 7/14/2026, 2:18:10 PM
class Solution {
    public int numDecodings(String s) {
        int n=s.length();
        if(n==0||s.charAt(0)=='0'){
            return 0;
        }
        int[] a=new int[n+1];
        a[0]=1;
        a[1]=1;
        for(int i=2;i<=n;i++){
            int od=s.charAt(i-1)-'0';
            int td=Integer.parseInt(s.substring(i-2,i));
            if(od>=1){
                a[i]+=a[i-1];
            }
            if(td>=10&&td<=26){
                a[i]+=a[i-2];
            }
        }
        return a[n];
    }
}