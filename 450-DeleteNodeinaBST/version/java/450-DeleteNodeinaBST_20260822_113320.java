// Last updated: 8/22/2026, 11:33:20 AM
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
17    public TreeNode deleteNode(TreeNode root, int key) {
18        if(root==null){
19            return null;
20        }
21        else if(key>root.val){
22            root.right=deleteNode(root.right,key);
23        }
24        else if(key<root.val){
25            root.left=deleteNode(root.left,key);
26        }
27        else{
28            if(root.left==null&&root.right==null){
29                return null;
30            }
31            else if((root.left!=null&&root.right==null)||(root.left==null&&root.right!=null)){
32                return root.left!=null?root.left:root.right;
33            }
34            else{
35                root.val=findMin(root.right);
36                root.right=deleteNode(root.right,root.val);
37            }
38        }
39        return root;
40    }
41    public static int findMin(TreeNode root){
42        if(root.left==null){
43            return root.val;
44        }
45        return findMin(root.left);
46    }
47}