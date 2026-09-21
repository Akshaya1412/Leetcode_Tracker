// Last updated: 9/21/2026, 9:24:26 PM
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