// Last updated: 9/17/2026, 3:00:02 PM
1class Solution {
2    public int[][] transpose(int[][] matrix) {
3        int[][] a=new int[matrix[0].length][matrix.length];
4        for(int i=0;i<matrix.length;i++){
5            for(int j=0;j<matrix[0].length;j++){
6                a[j][i]=matrix[i][j];
7            }
8        }
9        return a;
10    }
11}