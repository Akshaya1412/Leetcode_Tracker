// Last updated: 9/28/2026, 12:34:01 PM
1class Solution {
2    public String shortestCompletingWord(String licensePlate, String[] words) {
3        String target = licensePlate.toLowerCase();
4        int [] charMap = new int[26];
5        // Construct the character map
6        for(int i = 0 ; i < target.length(); i++){
7            if(Character.isLetter(target.charAt(i))) charMap[target.charAt(i) - 'a']++;
8        }
9        int minLength = Integer.MAX_VALUE;
10        String result = null;
11        for (int i = 0; i < words.length; i++){
12            String word = words[i].toLowerCase();
13            if(matches(word, charMap) && word.length() < minLength) {
14                minLength = word.length();
15                result  = words[i];
16            }
17        }
18        return result;
19    }
20    private boolean matches(String word, int[] charMap){
21        int [] targetMap = new int[26];
22        for(int i = 0; i < word.length(); i++){
23            if(Character.isLetter(word.charAt(i))) targetMap[word.charAt(i) - 'a']++;
24        }
25        
26        for(int i = 0; i < 26; i++){
27            if(charMap[i]!=0 && targetMap[i]<charMap[i]) return false;
28        }
29        return true;
30    }
31}