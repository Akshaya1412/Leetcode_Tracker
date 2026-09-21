// Last updated: 9/21/2026, 9:25:21 PM
class Solution {
    public int minFlipsMonoIncr(String s) {
        int ans=0,noflip=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='0'){
                ans=Math.min(noflip,ans+1);
            }
            else{
                noflip++;
            }
        }
        return ans;
    }
}