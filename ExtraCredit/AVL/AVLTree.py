class TreeNode(object):

     def __init__(self, val=0, left=None, right=None):

         self.val = val

         self.left = left

         self.right = right

class AVLTree(object):
    def insert(self, root, key):
        if not root:
            return TreeNode(key)
        elif (key<root.val):
            root.left = self.insert(root.left,key)
        else:
            #if the key is equal to the root val it will still go to the right
            root.right = self.insert(root.right, key)
    
        leftHeight = self.getHeight(root.left)
        rightHeight = self.getHeight(root.right)
        root.height = 1 + max(leftHeight, rightHeight)
        
        
        balance = self.getBalance(root)
    
    def getHeight(self,root):
        if not root:
            return 0
        return root.height
    
    def getBalance(self,root):
        if not root:
            return 0
        return self.getHeight(root.left) - self.getHeight(root.right)
        
        
    def inOrderTraversal(self, root):
        self.inOrderTraversal(root.left)
        print(root)
        self.inOrderTraversal(root.right)
        
    def preOrderTraversal(self, root):
        print(root)
        self.inOrderTraversal(root.left)
        self.inOrderTraversal(root.right)   
         
    def postOrderTraversal(self, root):
        self.inOrderTraversal(root.left)
        self.inOrderTraversal(root.right)
        print(root)
        
    
        
    def deletion(self, root, key):
        if not root:
            return root
        
        if key < root.val:
            root.left = self.deletion(root.left, key)
        elif key > root.val:
            root.right = self.deletion(root.right, key)
            