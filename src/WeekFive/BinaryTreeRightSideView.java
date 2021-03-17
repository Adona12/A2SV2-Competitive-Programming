package WeekFive;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class BinaryTreeRightSideView {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();
        List<Integer> result = new ArrayList<>();
        if( root == null){
            return result;
        }
        queue.add(root);
        result.add(root.val);
        while(!queue.isEmpty()){
            int length = queue.size();
            for(int i = 0; i < length; i++){
                TreeNode node = queue.remove();
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                    //  result.add(node.right.val);
                }


            }
            if(!queue.isEmpty()){
                result.add(queue.peekLast().val);
            }

        }
        return result;
    }

}
