package WeekFour;

import java.util.ArrayDeque;
import java.util.Queue;

public class FindBottomLeftTreeValue {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);

        int leftMost = root.val;
        while(queue.size() != 0){
            int length = queue.size();
            for( int i = 0; i < length; i++){
                TreeNode node = queue.remove();
                if( i == 0){
                    leftMost = node.val;
                }
                if( node.left != null){
                    queue.add( node.left);
                }
                if( node.right != null){
                    queue.add( node.right);
                }
            }
        }
        return leftMost;

    }
}
