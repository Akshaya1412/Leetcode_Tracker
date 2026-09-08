// Last updated: 9/8/2026, 2:44:17 PM
1class Solution {
2    public int mostWordsFound(String[] sentences) {
3        int max=0;
4        for(int i=0;i<sentences.length;i++){
5            String word=sentences[i];
6            int count=1;
7            for(int j=0;j<word.length();j++){
8                if(word.charAt(j)==' '){
9                    count++;
10                }
11            }
12            if(count>max){
13                max=count;
14            }
15        }
16        return max;
17    }
18}