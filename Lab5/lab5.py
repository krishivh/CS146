import math

class TreeNode(object):
    def __init__(self, val=0, left=None, right=None):

         self.val = val

         self.left = left

         self.right = right
         
class lab5: 
          
    def isValidBST(self, root):
        #define positive and negative infinity to be the minimum and maximum values for the first call of the helper function
        pos_inf = math.inf
        neg_inf = -math.inf 
        #need the helper function to have a left and right values, the left acting as the min and right as max 
        def isValidBSTHelper(root, left, right):
            #if root is null then return true
            if not root:
                return True
            #if the basic properties of BST don't apply then it is definitely false
            if not (root.val<right and root.val>left):
                return False
            #make two recursive calls using the helper function
            #the first one calls the left of the root and has the minimum value as left and the maximum value as the right parameter
            #the second calls the right of the root and min value as root and max as right
            return(isValidBSTHelper(root.left, left, root.val) and isValidBSTHelper(root.right, root.val, right))
        #inital parameters is -infinity for left and infinity for right
        return isValidBSTHelper(root, neg_inf, pos_inf)
    

#Test Case 1
root = TreeNode(4)
node3 = TreeNode(3)
node8 = TreeNode(8)
node1 = TreeNode(1)
node5 = TreeNode(5)
node9 = TreeNode(9)
    
root.left = node3
root.right = node8
node3.left = node1
node8.left = node5
node8.right = node9

lab5solution = lab5()
result = lab5solution.isValidBST(root)
print(result)



#Test Case 2
"""
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

lab5solution = lab5()
result = lab5solution.isValidBST(root)
print(result)
"""