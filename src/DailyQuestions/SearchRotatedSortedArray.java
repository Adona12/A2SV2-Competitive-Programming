package DailyQuestions;

public class SearchRotatedSortedArray {
    public boolean search(int[] nums, int target) {
        int index = 0;
        for (int i = 1;i < nums.length;i++){
            if(nums[i-1] > nums[i]){
                index = i - 1;
                break;
            }
        }
        if(target >= nums[0] && target <= nums[index]){
            return  binarySearch(nums,0,index,target);
        }
        return  binarySearch(nums,index+1,nums.length-1,target);
    }
    public boolean binarySearch(int[] nums,int start,int end,int target){
        int mid = start + (end - start) / 2;
        if(start>end){
            return false;
        }
        if(nums[mid]==target){
            return true;
        }
        else if(nums[mid]>target){
            return binarySearch(nums,start,mid-1,target);
        }
        return binarySearch(nums,mid+1,end,target);
    }
}

