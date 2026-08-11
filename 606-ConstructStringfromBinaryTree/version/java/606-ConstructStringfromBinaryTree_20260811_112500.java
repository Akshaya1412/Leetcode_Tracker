// Last updated: 8/11/2026, 11:25:00 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode() {}
8 *     TreeNode(int val) { this.val = val; }
9 *     TreeNode(int val, TreeNode left, TreeNode right) {
10 *         this.val = val;
11 *         this.left = left;
12 *         this.right = right;
13 *     }
14 * }
15 */
16class Solution {
17    public String tree2str(TreeNode t) {
18        StringBuilder res=new StringBuilder();
19        dfs(t, res);
20        return res.toString();
21    }
22    public static void dfs(TreeNode t,StringBuilder res){
23        if(t==null)
24            return;
25            res.append(String.valueOf(t.val));
26            if(t.left==null&&t.right==null){
27                return;
28            }
29            res.append('(');
30            dfs(t.left,res);
31            res.append(')');
32            if(t.right!=null){
33                res.append('(');
34                dfs(t.right,res);
35                res.append(')');
36            }
37        
38    }
39}