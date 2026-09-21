// Last updated: 9/21/2026, 9:26:44 PM
class Solution {
    public int distributeCandies(int[] candyType) {
        Arrays.sort(candyType);
        int count=1;
        for(int i=1;i<candyType.length;i++){
            if(candyType[i]!=candyType[i-1]){
                count++;
            }
        }
        if(count<candyType.length/2){
            return count;
        }
        else{
            return candyType.length/2;
        }
    }
}