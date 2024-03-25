package Lab5;

public class lab5 {
    double posInf = Double.POSITIVE_INFINITY;
    double negInf = Double.NEGATIVE_INFINITY;

    public boolean isValidBST(TreeNode root) {
        return isValidBSTHelper(root, negInf, posInf );
    
}
    public boolean isValidBSTHelper(TreeNode root, double left, double right ){
        if(root==null){
            return true;
        }
        
        if(!(root.val > left && root.val < right)){
            return false; 
        }

        return isValidBSTHelper(root.left, left, root.val) && isValidBSTHelper(root.right, root.val, right);
    } 


    public static void main(String[] args){ 
        //Test Case 1
        
        TreeNode root = new TreeNode(4);
        TreeNode node3 = new TreeNode(3);
        TreeNode node1 = new TreeNode(1);
        TreeNode node8 = new TreeNode(8);
        TreeNode node5 = new TreeNode(5);
        TreeNode node9 = new TreeNode(9);

        root.left = node3;
        root.right = node8;
        node3.left = node1;
        node8.left = node5;
        node8.right = node9;

        lab5 lab5 = new lab5();
        boolean valid = lab5.isValidBST(root); 
        System.out.println(valid);
        
        


        //Test Case 2
        /* 
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

        lab5 lab5 = new lab5();
        boolean valid2 = lab5.isValidBST(root); 
        System.out.println(valid2);
        */
    }
}

