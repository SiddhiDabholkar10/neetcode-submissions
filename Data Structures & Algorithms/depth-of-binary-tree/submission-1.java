/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    public int maxDepth(TreeNode root) {
        if(root==null) return 0;
        return dfs(root);
    }
    public int dfs(TreeNode root){
        if(root == null){
            return 0;
        }
        int left_c = dfs(root.left);
        int right_c = dfs(root.right);
        return 1+Math.max(left_c,right_c);
    }
}
