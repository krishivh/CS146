class TreeNode(object):

     def __init__(self, val=0, left=None, right=None):

         self.val = val

         self.left = left

         self.right = right

class HW9:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        if root is None:
            return None
        if root == p or root == q:
            return root
        if p.val < root.val and q.val< root.val :
            return self.lowestCommonAncestor(root.left, p, q)
        if p.val> root.val and q.val> root.val :
            return self.lowestCommonAncestor(root.right, p, q)
        else:
            return root
    
#Test Case 1   
root = TreeNode(4)
node3 = TreeNode(3)
node1 = TreeNode(1)
node8 = TreeNode(8)
node5 = TreeNode(5)
node9 = TreeNode(9)
    
root.left = node3
root.right = node8
node3.left = node1
node8.left = node5
node8.right = node9
    
hw9solution = HW9()
result = hw9solution.lowestCommonAncestor(root, node1, node5)
print("LCA:", result.val)
    
    
    