package WeekFour;

public class SameTree {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if((p ==null && q!=null )|| (p !=null && q==null )){
            return false;
        }
        else if(p==null && q==null){
            return true;
        }
        boolean x=isSameTree(p.left,q.left);
        if(p.val!=q.val){
            return false;
        }
        boolean y=isSameTree(p.right,q.right);
        return x&&y;
    }
}
