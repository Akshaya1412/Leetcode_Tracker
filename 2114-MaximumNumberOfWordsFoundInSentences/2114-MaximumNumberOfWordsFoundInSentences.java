// Last updated: 9/21/2026, 2:27:37 PM
class Solution {
    public int mostWordsFound(String[] sentences) {
        int max=0;
        for(int i=0;i<sentences.length;i++){
            String word=sentences[i];
            int count=1;
            for(int j=0;j<word.length();j++){
                if(word.charAt(j)==' '){
                    count++;
                }
            }
            if(count>max){
                max=count;
            }
        }
        return max;
    }
}