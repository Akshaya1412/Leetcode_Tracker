// Last updated: 8/24/2026, 12:04:56 PM
1class Solution {
2    public List<Integer> generateRow(int n){
3       List<Integer>lst =new ArrayList<>();
4       int ans=1;
5       lst.add(ans);
6       for(int i =1;i<n;i++){
7        ans=ans*(n-i);
8        ans=ans/i;
9        lst.add(ans);
10       }
11       return lst;
12    }
13    public List<List<Integer>> generate(int numRows) {
14        List<List<Integer>>ans= new ArrayList<>();
15        for(int i =1;i<=numRows;i++){
16            ans.add(generateRow(i));
17        }
18        return ans;
19    }
20}