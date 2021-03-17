package WeekFive;

public class smallestThreshold {
    public int smallestDivisor(int[] nums, int threshold) {
        int left =1;
        int right = nums[0];

        for( int i=0; i < nums.length; i++){
            if( nums[i] >right){
                right = nums[i];
            }
        }
        int result =right,sum =0, mid = 0;
        while( left <= right){

            mid= (left + right)/2;
            sum = sum(nums,mid);
            if( sum > threshold){

                left = mid+1;
            }else{
                right = mid-1;
                result = mid;

            }
        }
        return result;
    }
    public int sum( int[] nums,int divisor){
        int total = 0;
        for( int i=0; i < nums.length; i++){
            total += Math.ceil(Double.valueOf(nums[i])/Double.valueOf(divisor));
        }
        return total;
    }
}
