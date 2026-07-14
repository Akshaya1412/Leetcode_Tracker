// Last updated: 7/14/2026, 2:17:48 PM
class Solution {
    public void reverseString(char[] s) {
       int l=0,r=s.length-1;
       while(l<r){
        char temp=s[l];
        s[l]=s[r];
        s[r]=temp;
        l++;
        r--;
       } 
    }
}