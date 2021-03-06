package DailyQuestions;

public class ContainerWithWater {
    public int maxArea(int[] height) {

        int leftCounter = 0;
        int rightCounter = height.length - 1;
        int maxArea = 0;
        int result = 0;
        int width=0;

        while(rightCounter > leftCounter){
            width = rightCounter - leftCounter;

            if(height[leftCounter] > height[rightCounter]){
                result = height[rightCounter] * width;
                rightCounter--;

            }
            else{
                result = height[leftCounter] * width;
                leftCounter++;
            }


            if( result > maxArea){
                maxArea = result;
            }

        }
        return maxArea;
    }
}
