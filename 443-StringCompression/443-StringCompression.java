// Last updated: 7/14/2026, 2:17:32 PM
class Solution {
    public int compress(char[] chars) {
        String sb=new String();
        for(int i=0;i<chars.length;i++){
            char ch=chars[i];
            int c=1;
            for(int j=i+1;j<chars.length;j++){
                if(chars[j]==ch){
                    c++;
                    i++;
                }
                else{
                    break;
                }
            }
            sb+=ch;
            if(c>1){
                sb+=c;
            }
        }
        for(int i=0;i<sb.length();i++){
            chars[i]=sb.charAt(i);
        }
        return sb.length();
    }
}