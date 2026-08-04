// Last updated: 8/4/2026, 11:16:12 AM
1class Solution {
2    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
3        Map<Integer,Integer> map=new HashMap<>();
4        for(int i=0;i<indices.length;i++){
5            if(s.startsWith(sources[i],indices[i])){
6                map.put(indices[i],i);
7            }
8        }
9        StringBuilder sb=new StringBuilder();
10        for(int i=0;i<s.length();){
11            if(!map.containsKey(i)){
12                sb.append(s.charAt(i));
13                i++;
14            }
15            else{
16                sb.append(targets[map.get(i)]);
17                i+=sources[map.get(i)].length();
18            }
19        }
20        return sb.toString();
21    }
22}