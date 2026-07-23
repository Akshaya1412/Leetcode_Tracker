// Last updated: 7/23/2026, 11:05:23 AM
1class Solution {
2    public String customSortString(String order, String s) {
3        StringBuilder result=new StringBuilder();
4        HashMap<Character,Integer>mp=new HashMap<>();
5        for(char c:s.toCharArray()){
6            mp.put(c,mp.getOrDefault(c,0)+1);
7        }
8        for(char c:order.toCharArray()){
9            if(mp.containsKey(c)){
10                result.append(String.valueOf(c).repeat(Math.max(0,mp.get(c))));
11                mp.remove(c);
12            }
13        }
14        for(char c:mp.keySet()){
15            result.append(String.valueOf(c).repeat(Math.max(0,mp.get(c))));
16        }
17        return result.toString();
18    }
19}