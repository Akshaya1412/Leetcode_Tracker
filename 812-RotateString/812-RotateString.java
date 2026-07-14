// Last updated: 7/14/2026, 2:17:13 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String doubled =s+s;
        return doubled.contains(goal);
    }
}