// Last updated: 9/21/2026, 9:30:13 PM
class Solution {
    public List<Integer> generateRow(int n){
       List<Integer>lst =new ArrayList<>();
       int ans=1;
       lst.add(ans);
       for(int i =1;i<n;i++){
        ans=ans*(n-i);
        ans=ans/i;
        lst.add(ans);
       }
       return lst;
    }
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>>ans= new ArrayList<>();
        for(int i =1;i<=numRows;i++){
            ans.add(generateRow(i));
        }
        return ans;
    }
}