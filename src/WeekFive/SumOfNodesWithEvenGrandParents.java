package WeekFive;

public class SumOfNodesWithEvenGrandParents {
    public int sumEvenGrandparent(TreeNode root) {
        return dfs(root,false);
    }

    public int dfs(TreeNode node,boolean parentVal){
        int total=0;

        if (node == null) return 0;

        if (node.left != null && parentVal){
            total += node.left.val;

        }
        if (node.right != null && parentVal){
            total += node.right.val;
        }

        boolean parentCheck = node.val %2 == 0;

        return dfs(node.left,parentCheck)+dfs(node.right,parentCheck)+total;


    }
}
