// Last updated: 8/11/2026, 12:10:12 PM
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
17    public String smallestFromLeaf(TreeNode root) {
18        return smallStr(root,new StringBuilder()).toString();
19    }
20    StringBuilder smallStr(TreeNode root,StringBuilder sb){
21        if(root==null){
22            return sb;
23        }
24        sb.append((char)('a' + root.val));
25        if(root.left==null && root.right==null){
26            return sb.reverse();
27        }
28        StringBuilder sb1 = root.left != null ? smallStr(root.left,new StringBuilder(sb)):null;
29        StringBuilder sb2 = root.right !=null ? smallStr(root.right,new StringBuilder(sb)):null;
30        if(sb1!=null && sb2!=null){
31            return sb1.toString().compareTo(sb2.toString())<0 ? sb1 : sb2;
32        }else{
33            return sb1!=null ? sb1 : sb2;
34        }
35    }
36}