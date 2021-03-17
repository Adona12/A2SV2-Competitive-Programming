package WeekFour;

import java.util.ArrayList;
import java.util.List;

public class MinimumDistanceBetweenBSTNodes {
    public int minDiffInBST(TreeNode root) {
        // Queue<TreeNode> queue = new ArrayDeque<>();
        List<Integer> list = new ArrayList<>();
        inOrder(root,list);
        int min = list.get(1)-list.get(0);
        for( int i = 2; i < list.size(); i++){
            if( list.get(i)-list.get(i-1) < min){
                min = list.get(i)-list.get(i-1);
            }
        }
        return min;

    }
    public void inOrder( TreeNode node, List<Integer> list){
        if( node == null){
            return;
        }

        inOrder(node.left,list);
        list.add(node.val);
        inOrder(node.right,list);

    }
}
