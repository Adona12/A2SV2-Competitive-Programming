package WeekOne;

import java.util.Arrays;

public class MarkAndToys {
    static int maximumToys(int[] prices, int k) {
        Arrays.sort(prices);
        int total=0;
        int nums=0;
        for(int i=0;i<prices.length;i++){
            if((total+prices[i])<=k){
                nums++;

            }
            else{
                break;
            }
            total+=prices[i];
        }
        System.out.println(nums);
        return nums;

    }

}
