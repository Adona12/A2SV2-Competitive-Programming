package WeekSix;

import java.util.Arrays;
import java.util.List;

public class MinimumTimeDifference {
    public int findMinDifference(List<String> timePoints) {
        int[] minutes = new int[timePoints.size()];
        for( int i = 0; i < timePoints.size(); i++){
            String[] time = timePoints.get(i).split(":");
            int calculated = (Integer.parseInt(time[0]) * 60 )+ Integer.parseInt(time[1]);

            minutes[i] = calculated;
            System.out.println(calculated);

        }
        Arrays.sort(minutes);
        int min = minutes[minutes.length-1];

        int leftPointer  = 0;
        boolean checked = false;
        int rightPointer  = minutes.length-1;
        while( rightPointer < minutes.length){

            int temp = 0;
            if(Math.abs(minutes[leftPointer] - minutes[rightPointer]) > 720){

                int newVal = Math.abs(minutes[rightPointer] -1440);
                temp =  Math.abs(minutes[leftPointer] + newVal);
            }else{
                temp = Math.abs(minutes[leftPointer] - minutes[rightPointer]);

            }
            if( temp < min){
                min = temp;
            }
            if(rightPointer == minutes.length-1 && !checked){

                rightPointer = leftPointer + 1;
                checked = true;
                continue;
            }
            leftPointer++;
            rightPointer++;

        }
        return min;

    }
}
