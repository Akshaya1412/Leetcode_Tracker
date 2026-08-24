// Last updated: 8/24/2026, 12:01:11 PM
1class Solution {
2    public List<List<Integer>> generate(int numRows) {
3        List<List<Integer>> pascal=new ArrayList<>();
4        for(int i=0;i<numRows;i++){
5            List<Integer> row=new ArrayList<>(Collections.nCopies(i+1,1));
6            for(int j=1;j<i;j++){
7                int val=pascal.get(i-1).get(j-1)+pascal.get(i-1).get(j);
8                row.set(j,val);
9            }
10            pascal.add(row);
11        }
12        return pascal;
13    }
14}