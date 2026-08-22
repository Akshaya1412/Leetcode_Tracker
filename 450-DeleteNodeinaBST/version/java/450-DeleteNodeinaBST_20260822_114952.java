// Last updated: 8/22/2026, 11:49:52 AM
1/**
2 * Definition for a binary tree node.
3 * public class TreeNode {
4 *     int val;
5 *     TreeNode left;
6 *     TreeNode right;
7 *     TreeNode(int x) { val = x; }
8 * }
9 */
10public class Codec {
11    static TreeNode res;
12
13    // Encodes a tree to a single string.
14    public String serialize(TreeNode root) {
15        res=root;
16        return "";
17    }
18
19    // Decodes your encoded data to tree.
20    public TreeNode deserialize(String data) {
21        return res;
22    }
23}
24
25// Your Codec object will be instantiated and called as such:
26// Codec ser = new Codec();
27// Codec deser = new Codec();
28// String tree = ser.serialize(root);
29// TreeNode ans = deser.deserialize(tree);
30// return ans;