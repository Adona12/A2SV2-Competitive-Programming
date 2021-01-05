package WeekOne;

public class SortColor {
    public void sortColors(int[] nums) {
        int zeros=0;
        int ones=0;
        int twos=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                zeros++;
            }
            else if(nums[i]==1){
                ones++;
            }
            else{
                twos++;
            }
        }
        for(int i=0;i<nums.length;i++){
            if(zeros!=0){
                zeros--;
                nums[i]=0;
            }
            else if(ones!=0){
                ones--;
                nums[i]=1;
            }
            else if(twos!=0){
                twos--;
                nums[i]=2;
            }


        }
    }
}
