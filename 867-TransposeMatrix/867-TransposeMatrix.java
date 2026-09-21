// Last updated: 9/21/2026, 9:25:44 PM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] a=new int[matrix[0].length][matrix.length];
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                a[j][i]=matrix[i][j];
            }
        }
        return a;
    }
}