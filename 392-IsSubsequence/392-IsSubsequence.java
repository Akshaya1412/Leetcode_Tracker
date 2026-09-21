// Last updated: 9/21/2026, 9:27:55 PM
class Solution {
    public boolean isSubsequence(String s, String t) {
        int sp=0;
        int tp=0;
        while(sp<s.length()&&tp<t.length()){
            if(s.charAt(sp)==t.charAt(tp)){
                sp++;

            }
            tp++;
        }
        return sp==s.length();
    }
}