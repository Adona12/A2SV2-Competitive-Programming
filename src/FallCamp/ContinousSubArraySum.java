package FallCamp;

import java.util.HashMap;

public class ContinousSubArraySum {
    public boolean checkSubarraySum(int[] nums, int k) {
        if(nums.length == 1){
            return false;
        }
        int[] sum = new int[nums.length];
        HashMap<Integer,Integer> map= new HashMap<>();
        sum[0] = nums[0];
        for(int i = 1; i < nums.length; i++){
            sum[i] = sum[ i - 1] + nums[i];
        }
        for(int i = 0; i < sum.length; i++){
            sum[i] = sum[i] % k;
            if((sum[i] == 0 && i != 0 ) || (map.containsKey(sum[i]) && Math.abs(i - map.get(sum[i])) > 1)) return true;
            if(!map.containsKey(sum[i])) map.put(sum[i],i);
        }
        return false;
    }
}
