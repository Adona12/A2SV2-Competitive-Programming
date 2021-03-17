package WeekFive;

import java.util.*;

public class BinaryTreeZigzagLevelOrder {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        Queue<TreeNode> queue = new ArrayDeque<>();
        boolean zigzag =false;
        if(root == null){
            return list;
        }
        queue.add(root);

        while(queue.size() != 0){
            List<Integer> innerList = new ArrayList<>();
            int length =queue.size();
            for( int i=0; i< length; i++){

                TreeNode node = queue.remove();
                innerList.add(node.val);

                if(node.left !=null) {
                    queue.add(node.left);
                }
                if(node.right !=null) {
                    queue.add(node.right);
                }




            }
            if(zigzag ==true){
                Collections. reverse(innerList);

            }

            list.add(innerList);
            zigzag = !zigzag;

        }
        return list;

    }
}
