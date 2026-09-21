// Last updated: 9/21/2026, 9:29:42 PM
class Solution {
    public String convertToTitle(int columnNumber) {
        String res="";
        while(columnNumber>0){
            columnNumber--;
            int rem=columnNumber%26;
            char ch=(char)('A'+rem);
            res=ch+res;
            columnNumber/=26;
        }
        return res;
    }
}