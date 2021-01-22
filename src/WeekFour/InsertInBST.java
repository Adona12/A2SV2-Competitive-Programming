package WeekFour;

public class InsertInBST {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null){
            return new TreeNode(val);
        }
        TreeNode temp=root;
        while(temp!=null){
            if(val>temp.val){
                if(temp.right==null){
                    temp.right=new TreeNode(val);
                    return root;
                }
                else{
                    temp=temp.right;
                }
            }
            else{
                if(temp.left==null){
                    temp.left=new TreeNode(val);
                    return root;
                }
                else{
                    temp=temp.left;
                }
            }
        }
        return root;
    }
}
