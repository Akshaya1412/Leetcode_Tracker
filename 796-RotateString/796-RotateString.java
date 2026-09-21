// Last updated: 9/21/2026, 9:25:54 PM
class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String doubled =s+s;
        return doubled.contains(goal);
    }
}