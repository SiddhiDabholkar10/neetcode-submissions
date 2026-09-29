# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def __init__(self):
        self.prev = None
        self.first = None
        self.middle = None
        self.last = None

    def inorder(self, root: Optional[TreeNode]) -> None:
        if(root is None):
            return
        self.inorder(root.left);
        if((self.prev is not None) and self.prev.val>root.val):
            if(self.first is None):
                self.first = self.prev
                self.middle = root
            else:
                self.last = root
        self.prev = root;
        self.inorder(root.right);

    def recoverTree(self, root: Optional[TreeNode]) -> None:
        """
        Do not return anything, modify root in-place instead.
        """
        self.prev = self.first = self.middle = self.last = None
        self.inorder(root);
        if(self.first is not None and  self.last is not None):
            temp = self.first.val
            self.first.val = self.last.val;
            self.last.val = temp;
        
        elif(self.first is not None and   self.middle is not None):
            temp = self.first.val;
            self.first.val = self.middle.val;
            self.middle.val = temp;
            
        

        