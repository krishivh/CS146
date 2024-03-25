package Lab4;

public class Lab4 {
    public TreeNode invertTree(TreeNode root) {    
        
        //if a node that is null is recusively called it will just return null instead of continuing through the rest of the function
        if (root == null) {
            return null;
        }
        
        //first 4 lines are to swap the left value of the root and right value of the root
        TreeNode temp;
        temp = root.left;
        root.left = root.right;
        root.right = temp;
        //this will continue down the left side and right side and continue swapping the children
        invertTree(root.left);
        invertTree(root.right);
        return root;
     }  
    
    public static void main(String[] args)
    {
        
        TreeNode root = new TreeNode(1);
        TreeNode node2 = new TreeNode(2);
        TreeNode node8 = new TreeNode(8);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(4);
        TreeNode node5 = new TreeNode(5);
        TreeNode node6 = new TreeNode(6);

        root.left = node2;
        root.right = node8;
        node2.left = node3;
        node2.right = node4;
        node8.left = node5;
        node8.right = node6;

        Lab4 lab4 = new Lab4();
        TreeNode result = lab4.invertTree(root);
         System.out.println("Root: " + result.val);
    }
}
