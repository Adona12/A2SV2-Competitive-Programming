package WeekFour;

import java.util.ArrayList;
import java.util.List;

public class PostOrderTraversal {
    public static void main(String[] args) {
        TreeNode tree=new TreeNode(1,null,new TreeNode(2,new TreeNode(3),new TreeNode(4)));
        postorderTraversal(tree);
    }
    static List<Integer> integers= new ArrayList<>();
    public static  List<Integer> postorderTraversal(TreeNode root) {
          post(root);

           return integers;
    }
    public  static  void post (TreeNode root){
        if(root==null){
            return;
        }
        else{
            postorderTraversal(root.right);
            postorderTraversal(root.left);
            System.out.println(root.val);

        }
    }
}
