package WeekFour;

public class RangeInBST {
    int total=0;
    public int rangeSumBST(TreeNode root, int low, int high) {

        sum(root,low,high);
        return total;
    }
    public void sum(TreeNode root, int low, int high) {
        if(root ==null){
            return ;
        }
        else{


            sum(root.left,low,high);

            if(root.val<=high && root.val>=low){
                System.out.println(root.val);
                total+=root.val;
            }

            sum(root.right,low,high);
            
        }

    }
}
