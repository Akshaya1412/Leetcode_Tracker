// Last updated: 7/14/2026, 2:17:46 PM
class Solution {
    public String reverseVowels(String s) {
        char[] chars=s.toCharArray();
        int st=0,e=s.length()-1;
        while(st<e){
            while(st<e&&!isVowel(chars[st])){
                st++;
            }
            while(st<e&&!isVowel(chars[e])){
                e--;
            }
            if(st<e){
                swap(chars,st,e);
                st++;
                e--;
            }
        }
        return new String(chars);
    }
    private void swap(char[] word,int st,int e){
        char temp=word[st];
        word[st]=word[e];
        word[e]=temp;
    }
    private boolean isVowel(char c){
        return c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U';
    }
}