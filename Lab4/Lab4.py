class TreeNode(object):

     def __init__(self, val=0, left=None, right=None):

         self.val = val

         self.left = left

         self.right = right
         
class Lab4:
    def invertTree(self, root):
        if root is None:
            return None
        temp = root.left
        root.left = root.right
        root.right = temp
        self.invertTree(root.left)
        self.invertTree(root.right)
        return root

#Test Case 1
root = TreeNode(1)
node8 = TreeNode(8)
node2 = TreeNode(2)
node3 = TreeNode(3)
node4 = TreeNode(4)
node5 = TreeNode(5)
node6 = TreeNode(6)
    
root.left = node2
root.right = node8
node2.left = node3
node2.right = node4
node8.left = node5
node8.right = node6

lab4solution = Lab4()
result = lab4solution.invertTree(root)
print(result.val)
print(root.left.val)
print(root.right.val)
print(node8.left.val)
print(node8.right.val)
print(node2.left.val)
print(node2.right.val)