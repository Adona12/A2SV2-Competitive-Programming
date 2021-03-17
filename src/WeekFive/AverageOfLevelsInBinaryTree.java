package WeekFive;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class AverageOfLevelsInBinaryTree {
    public List<Double> averageOfLevels(TreeNode root) {

        Queue<TreeNode> queue = new ArrayDeque<>();
        ArrayList<Double> list = new ArrayList<>();
        queue.add(root);

        int length = 0;

        while( queue.size()!=0){
            double total =0;
            length = queue.size();
            for( int i =0; i < length; i++){
                TreeNode node = queue.remove();
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
                total+=(Double.valueOf(node.val));

            }
            list.add(total/Double.valueOf(length));
        }
        return list;
    }
}
