// Last updated: 9/8/2026, 9:54:36 PM
1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        int count=0;
4        for(int i=0;i<stones.length();i++){
5            for(int j=0;j<jewels.length();j++){
6                if(stones.charAt(i)==jewels.charAt(j)){
7                    count++;
8                    break;
9                }
10            }
11        }
12        return count;
13    }
14}