// Last updated: 9/21/2026, 9:27:11 PM
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())){
            return true;
        }
        if(word.equals(word.toLowerCase())){
            return true;
        }
        if(Character.isUpperCase(word.charAt(0))&&word.substring(1).equals(word.substring(1).toLowerCase())){
            return true;
        }
        return false;
    }
}