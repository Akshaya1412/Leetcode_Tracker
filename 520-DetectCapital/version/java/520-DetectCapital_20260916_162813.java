// Last updated: 9/16/2026, 4:28:13 PM
1class Solution {
2    public boolean detectCapitalUse(String word) {
3        if(word.equals(word.toUpperCase())){
4            return true;
5        }
6        if(word.equals(word.toLowerCase())){
7            return true;
8        }
9        if(Character.isUpperCase(word.charAt(0))&&word.substring(1).equals(word.substring(1).toLowerCase())){
10            return true;
11        }
12        return false;
13    }
14}