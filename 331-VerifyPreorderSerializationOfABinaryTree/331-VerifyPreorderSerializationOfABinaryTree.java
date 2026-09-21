// Last updated: 9/21/2026, 9:28:16 PM
class Solution {
    public boolean isValidSerialization(String preorder) {
        String[] nodes=preorder.split(",");
        int diff=0;
        for(int i=0;i<nodes.length;i++){
            if(nodes[i].equals("#")){
                diff--;
            }
            else{
                diff++;
            }
            if(diff==-1&&i!=nodes.length-1){
                return false;
            }
        }
        return diff==-1;

    }
}