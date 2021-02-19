package WeekFive;


import java.util.ArrayDeque;

public class MinimumDepthOfTree {
    public int minDepth(TreeNode root) {
        if(root==null){
            return 0;
        }
        return bfs(root);
    }
    public int bfs(TreeNode root){
        int level = 1;
        ArrayDeque<TreeNode> queue = new ArrayDeque<>();

        queue.add(root);

        while(!queue.isEmpty()){
            int size=queue.size();

            for(int i = 0;i<size;i++){
                TreeNode node=  queue.remove();
                if(node.left==null&& node.right==null){
                    return level;
                }
                if(node.left != null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }

            }


            level++;
        }
        return level;
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
