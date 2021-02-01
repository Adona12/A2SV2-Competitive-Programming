package WeekFour;

public class MaximumBinaryTree {
    public TreeNode constructMaximumBinaryTree(int[] nums) {

        return constructMaximumBinaryTree(nums,0,nums.length-1);
    }

    public TreeNode constructMaximumBinaryTree(int[] nums,int start, int end){

        if(start>end){
            return null;
        }

        int max=nums[start];
        int index=start;
        for(int i=start;i<=end;i++){
            if(nums[i]>max){
                max=nums[i];
                index=i;
            }
        }


        TreeNode last=new TreeNode(max);

        last.left=constructMaximumBinaryTree(nums,start,index-1);


        last.right=constructMaximumBinaryTree(nums,index+1,end);



        return last;


    }
}
