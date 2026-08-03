// Last updated: 8/3/2026, 12:28:43 PM
1class Solution {
2    public int numSpecialEquivGroups(String[] words) {
3        HashSet<String> set=new HashSet<>();
4        int result=0;
5        for(String str: words){
6            if(set.add(getHashBySwap(str.toCharArray()))){
7                result++;
8            }
9        }
10        return result;
11    }
12    private String getHashBySwap(char[] chars){
13        for(int i=0;i<chars.length;i++){
14            for(int j=i+2;j<chars.length;){
15                if(chars[i]>chars[j]){
16                    char temp=chars[j];
17                    chars[j]=chars[i];
18                    chars[i]=temp;
19                }
20                j+=2;
21            }
22        }
23        return String.valueOf(chars);
24    }
25}