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
    int count = 0;
    int kSmallest = -1;
    public int kthSmallest(TreeNode root, int k) {
        inorderTraversal(root,k);
        return kSmallest;
    }
    public void inorderTraversal(TreeNode root,int k){
        if(root == null || count>=k) return;
        inorderTraversal(root.left,k);
        count++; // counting the node we visited now;
        if(count == k){
            kSmallest = root.val;
            return;
        }
        inorderTraversal(root.right,k);
    }
}
