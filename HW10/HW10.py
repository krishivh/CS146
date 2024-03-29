import collections
from typing import Optional, List 


class TreeNode(object):

     def __init__(self, val=0, left=None, right=None):

         self.val = val

         self.left = left

         self.right = right


class HW10:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        if root is None:
            return None
        
        queue = collections.deque([root])
        
        finalList = []
        
        while len(queue) > 0:
            queueSize = len(queue)
            Level = []
            for i in range(queueSize):
                curr = queue.popleft()
                if curr is not None:
                    Level.append(curr.val)
                    if curr.left is not None:
                        queue.append(curr.left)
                    if curr.right is not None:
                        queue.append(curr.right)
            if Level is not None:
                finalList.append(Level)
                    
        return finalList
                
                
        
        
##root = TreeNode(4)
##root.left = TreeNode(3)
##root.right = TreeNode(8)
##root.left.left = TreeNode(1)
##root.right.left = TreeNode(5)
##root.right.right = TreeNode(9)

##w10 = HW10()
##print(hw10.levelOrder(root))