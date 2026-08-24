// Last updated: 8/24/2026, 11:42:40 AM
1class Solution {
2    public List<String> commonChars(String[] words) {
3        List<String> result=new ArrayList<>();
4        for(char c='a';c<='z';c++){
5            int minCount=Integer.MAX_VALUE;
6            for(String word:words){
7                int count=0;
8                for(char ch:word.toCharArray()){
9                    if(ch==c){
10                        count++;
11                    }
12                }
13                minCount=Math.min(minCount,count);
14                if(minCount==0){
15                    break;
16                }
17            }
18            for(int i=0;i<minCount;i++){
19                result.add(String.valueOf(c));
20            }
21        }
22        return result;
23    }
24}