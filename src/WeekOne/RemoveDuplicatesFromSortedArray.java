package WeekOne;

public class RemoveDuplicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        int previous=nums[0];
        int index=1;

        for(int i=1;i<nums.length;i++){
            if(previous!=nums[i]){
                nums[index]=nums[i];
                previous=nums[i];
                index++;
            }
        }
        return index;
    }
}
