package HW9;

public class HW9 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        //not necessary because p and q do exist in the tree so root cannot be null
        /*if(root == null){
            return null;
        }*/

        //we need a base case to return the root if either p or q are the root
        if (root == p|| root==q){
            //if p or q is root, then LCA has to be the root
            return root;
        }

        //if the p and q values are both smaller then the root then we go to the left and continue searching
        if(p.val<root.val && q.val<root.val){
        return lowestCommonAncestor(root.left, p, q);
        }
        //if p and q values are both bigger than the root then we go right because that is greater than the root
        if(p.val>root.val && q.val>root.val){
        return lowestCommonAncestor(root.right,p,q);
        }

        //if neither of the if statements pass, then we know that p and q might be on opposite sides of the root,
        //meaning that the only LCA will be the root, and so since p and q exist it must return the root
        else{
            return root;
        }

    }

    
    
    public static void main(String[] args)
    {
        //Test Case
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

        HW9 hw9 = new HW9();
        TreeNode result = hw9.lowestCommonAncestor(root, node1, node3);
         System.out.println("LCA: " + result.val);
     }
 }
