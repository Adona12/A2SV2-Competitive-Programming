public class main {
    public static void main(String[] args) {
        int[] temp= {2,7,11,15};
        twoSum(temp,9);
    }
    public static int[] twoSum(int[] nums, int target) {
        int x[]=new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target && !(i==j)){
                    x[0]=i;
                    x[1]=j;
                }
            }
        }

        return x;
    }
}
