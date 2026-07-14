// Last updated: 7/14/2026, 2:19:10 PM
class Solution {
    public String longestPalindrome(String s) {
        String ans = "";
        int n = s.length();
        for(int i = 0 ; i < n ;i++){
            String odd = palindrome(i,i,s,n);
            if(odd.length() > ans.length()){
                ans = odd;
            }
            String even = palindrome(i,i+1,s,n);
            if(even.length() > ans.length()){
                ans = even;
            }
        }
        return ans;
    }
    public String palindrome(int st , int end , String s , int n){
        while(st>=0 && end < n && s.charAt(st) == s.charAt(end)){
            st--;
            end++;
        }
        return s.substring(st+1,end);
    }
}