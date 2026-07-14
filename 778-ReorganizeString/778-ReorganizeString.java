// Last updated: 7/14/2026, 2:17:17 PM
class Solution {
    public String reorganizeString(String s) {
        int[] charFreq=new int[26];
        for(char c:s.toCharArray()){
            charFreq[c-'a']++;
        }
        int maxFreq=0;
        char maxChar='a';
        for(int i=0;i<26;i++){
            if(charFreq[i]>maxFreq){
                maxFreq=charFreq[i];
                maxChar=(char)('a'+i);

            }
        }
        if(maxFreq>(s.length()+1)/2){
            return"";
        }
        char[] result=new char[s.length()];
        int index=0;
        while(charFreq[maxChar-'a']>0){
            result[index]=maxChar;
            index+=2;
            charFreq[maxChar-'a']--;
        }
        for(int i=0;i<26;i++){
            while(charFreq[i]>0){
                if(index>=result.length){
                    index=1;
                }
                result[index]=(char)('a'+i);
                index+=2;
                charFreq[i]--;
            }
        }
        return new String(result);

    }
}