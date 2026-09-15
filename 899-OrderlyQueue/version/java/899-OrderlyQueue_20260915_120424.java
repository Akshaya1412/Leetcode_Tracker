// Last updated: 9/15/2026, 12:04:24 PM
1class Solution {
2        public String orderlyQueue(String S, int K) {
3        if (K > 1) {
4            char S2[] = S.toCharArray();
5            Arrays.sort(S2);
6            return new String(S2);
7        }
8        String res = S;
9        for (int i = 1; i < S.length(); i++) {
10            String tmp = S.substring(i) + S.substring(0, i);
11            if (res.compareTo(tmp) > 0) res = tmp;
12        }
13        return res;
14    }
15}