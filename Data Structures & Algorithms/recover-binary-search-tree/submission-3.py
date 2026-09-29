# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    

    def inorder(self, root: Optional[TreeNode]) -> None:
        if(root is None):
            return
        self.inorder(root.left);
        if((self.prev is not None) and self.prev.val>root.val):
            if(self.first is None):
                self.first = self.prev
            self.second = root
        self.prev = root;
        self.inorder(root.right);

    def recoverTree(self, root: Optional[TreeNode]) -> None:
        """
        Do not return anything, modify root in-place instead.
        """
        self.prev = self.first = self.second = None
        self.inorder(root);
        self.first.val, self.second.val = (
                self.second.val,
                self.first.val,
            )
            
        

        