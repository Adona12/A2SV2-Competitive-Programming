package WeekThree;

public class BinarySearch {
    public int search(int[] nums, int target) {
        for(int i=0;i<nums.length;i++){
            if(nums[i]==target){
                return i;
            }
            else if(nums[i]>target){
                break;
            }
        }
        return -1;
    }
}
