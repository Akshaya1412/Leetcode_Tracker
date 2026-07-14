// Last updated: 7/14/2026, 2:17:38 PM
class Solution {
    public int firstUniqChar(String s) {
        int[] frq=new int[26];
        for(char c:s.toCharArray())
        ++frq[c-'a'];
        for(int i=0;i<s.length();++i)
        {
            if(frq[s.charAt(i)-'a']==1)
            return i;
        }
        return -1;

        
    }
}