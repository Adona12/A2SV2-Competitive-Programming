package WeekFour;

public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if((root.val>p.val && root.val<q.val) || (root.val<p.val && root.val>q.val) || root==p || root==q){
            return root;
        }
        else if( p.val<root.val && q.val<root.val){

            return lowestCommonAncestor(root.left,p,q);
        }
        else{
            return  lowestCommonAncestor(root.right,p,q);
        }


    }
}
