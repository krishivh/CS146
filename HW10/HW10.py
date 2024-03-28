import collections


class TreeNode(object):

     def __init__(self, val=0, left=None, right=None):

         self.val = val

         self.left = left

         self.right = right


class HW10:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        queue = collections.deque
        
        if root is None:
            return None
        
        queue.append(root)
        
        finalList = []
        
        while queue is not None:
            queueSize = len(queue)
            Level = []
            for i in range(queueSize):
                curr = queue.popleft()
                if curr is not None:
                    Level.append(curr.val)
                    queue.append(curr.left)
                    queue.append(curr.right)
            if Level is not None:
                finalList.append(Level)
                    
        return finalList
                
                
        
        
        