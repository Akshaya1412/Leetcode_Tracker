// Last updated: 9/1/2026, 11:36:50 AM
1class Solution {
2    public int[] findingUsersActiveMinutes(int[][] logs, int k) {
3        HashMap<Integer,HashSet<Integer>> usersMap=new HashMap();
4        for(int[] log:logs){
5            int user=log[0];
6            int min=log[1];
7            usersMap.putIfAbsent(user,new HashSet<Integer>());
8            usersMap.get(user).add(min);
9        }
10        int[] result=new int[k];
11        for(int user:usersMap.keySet()){
12            int uam=usersMap.get(user).size();
13            result[uam-1]++;
14        }
15        return result;
16    }
17}