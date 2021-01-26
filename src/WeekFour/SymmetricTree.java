package WeekFour;

public class SymmetricTree {
    public boolean isSymmetric(TreeNode root) {
        if(root==null){

            return true;
        }else{
            if((root.left!=null && root.right!=null) || (root.left==null && root.right==null) ) {
                return isSameTree(root.left,root.right);

            }
            else{
                return false;
            }


        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p ==null && q!=null )|| (p !=null && q==null )){
            return false;
        }
        else if(p==null && q==null){
            return true;
        }
        boolean x=isSameTree(p.left,q.right);
        if(p.val!=q.val){

            return false;
        }
        boolean y=isSameTree(p.right,q.left);


        return x&&y;
    }
}
