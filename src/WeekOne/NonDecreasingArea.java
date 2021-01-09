package WeekOne;

public class NonDecreasingArea {
    public static void main(String[] args) {
    }
    public boolean checkPossibility(int[] nums) {
        boolean first=true;
        for(int i=0;i<nums.length;i++) {
            if (first && i != 0 && nums[i] < nums[i - 1]) {
                if(!first ){
                    return false;
                }
                if (first && i + 1 < nums.length) {
                    if(nums[i+1]>nums[i-1]){
                        nums[i] = nums[i + 1];
                    }
                    else{
                        nums[i-1]=nums[i];
                    }

                } else if (first && i + 1 == nums.length) {
                    nums[i] = nums[i - 1] + 1;
                }
                first = false;
            }
        }
        for(int i=0;i<nums.length;i++) {
            if (!first&& i!= 0 && nums[i] < nums[i - 1]) {
                return false;
            }
        }
        return true;
    }

}