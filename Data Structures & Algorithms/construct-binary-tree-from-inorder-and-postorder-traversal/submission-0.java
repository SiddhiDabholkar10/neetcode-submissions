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
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        Map<Integer, Integer> inorder_indexmap = new HashMap<>();
        for(int i=0;i<inorder.length;i++){
            inorder_indexmap.put(inorder[i], i);
        }
        TreeNode root = buildTree(inorder,0,inorder.length-1,postorder,postorder.length-1,0,inorder_indexmap);
        return root;
    }
    public TreeNode buildTree(int[] inorder, int inStart, int inEnd, int[] postorder, int postStart, int postEnd, Map<Integer, Integer> inorder_indexmap){
        if(inStart>inEnd || postStart<postEnd) return null;
        TreeNode root = new TreeNode(postorder[postStart]);
        int inRoot = inorder_indexmap.get(root.val);
        int nodesOnLeft = inRoot-inStart;

        root.left = buildTree(inorder,inStart,inRoot-1,postorder,postEnd+nodesOnLeft-1,postEnd,inorder_indexmap);
        root.right = buildTree(inorder,inRoot+1,inEnd,postorder,postStart-1,postEnd+nodesOnLeft,inorder_indexmap);

        return root;


    }
}