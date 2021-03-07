package DailyQuestions;


import java.util.ArrayList;
import java.util.List;

public class KthSmallestElementInBST {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> nodeList=new ArrayList<>();
        kthSmallest(root,nodeList);
        if(k-1 < nodeList.size()){
            return nodeList.get(k-1);
        }
        return 0;
    }
    public void kthSmallest(TreeNode node,List<Integer> nodeList){
        if(node==null){
            return;
        }
        kthSmallest(node.left,nodeList);
        nodeList.add(node.val);

        kthSmallest(node.right,nodeList);
    }
}
