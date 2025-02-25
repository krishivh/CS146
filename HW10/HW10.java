package HW10;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.List;

public class HW10 {
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        //create the queue which will contain all the nodes that need to be checked
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        //this is the edge case of if the root is null then you just return null
        if (root==null){
            return new ArrayList<>();
        }
        
		//add the root into the queue so it can be checked first
        queue.add(root);
        //this list is the one that will be returned at the end of the function
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();

        //this while loop will run as long as there are more nodes in the queue
        while(!queue.isEmpty()){
            //get the queue size so that the for loop will terminate after the queue size is exceeded
            int queueSize = queue.size();
            //new list for each of the levels
            List<Integer> Level = new ArrayList<>();
            //for loop to add nodes to the level and then add new nodes to the queue to continue through the while loop
            for(int i=0; i<queueSize; i++){
                TreeNode curr = queue.remove();
                Level.add(curr.val);

                    if (curr.left != null) {
                        queue.add(curr.left);
                    }
                    if (curr.right != null) {
                        queue.add(curr.right);
                    }
                }        
            //only add the level to the final list as long as it is not null   
            //if(!Level.isEmpty()) 
                finalList.add(Level);    
            
        }
        //return the final list of values
        return finalList;






    }



    public static void main(String[] args)
    {
       /* 
        TreeNode root = new TreeNode(4);
        root.left = new TreeNode(3);
        root.right = new TreeNode(28);
        root.left.left = new TreeNode(1);
        root.right.left = new TreeNode(5);
        root.right.right = new TreeNode(9);
        
        HW10 hw10 = new HW10();
        System.out.println(hw10.levelOrder(root));

        */

    }
}
