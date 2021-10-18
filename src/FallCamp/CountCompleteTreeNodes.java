package FallCamp;
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
public class CountCompleteTreeNodes {
        public int countNodes(TreeNode root) {
            int level =calculateLevel(root);
            if(root == null) return 0;
            return dfs(root,level - 1, 0);

        }
        public int dfs(TreeNode node, int level, int current){
            if(node == null && current == level) return -1;
            if(current == level) return (int)Math.pow(2,current);
            int right = dfs(node.right, level,current + 1 );
            if(right < 0) right += dfs(node.left, level, current + 1);
            if(right > 0) right += (int)Math.pow(2,current);
            return right;
        }
        public int calculateLevel(TreeNode node){
            if(node == null){
                return 0;
            }
            return 1 + calculateLevel(node.left);
        }
}
