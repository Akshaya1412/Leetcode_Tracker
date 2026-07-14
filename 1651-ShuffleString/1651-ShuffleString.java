// Last updated: 7/14/2026, 2:17:09 PM
class Solution {
    public String restoreString(String s, int[] indices) {
        int l=s.length();
        StringBuilder sb=new StringBuilder("");
        char c[]=new char[l];
        for(int i=0;i<l;i++){
            c[indices[i]]=s.charAt(i);
        }
        sb.append(c);
        return sb.toString();
    }
}