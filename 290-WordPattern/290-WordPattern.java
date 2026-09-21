// Last updated: 9/21/2026, 9:28:26 PM
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] words=s.split(" ");
        if(pattern.length()!=words.length){
            return false;
        }
        for(int i=0;i<pattern.length();i++){
            for(int j=0;j<i;j++){
                if(pattern.charAt(i)==pattern.charAt(j)&&!words[i].equals(words[j])){
                    return false;
                }
                if(pattern.charAt(i)!=pattern.charAt(j)&&words[i].equals(words[j])){
                    return false;
                }
            }
        }
        return true;
    }
}