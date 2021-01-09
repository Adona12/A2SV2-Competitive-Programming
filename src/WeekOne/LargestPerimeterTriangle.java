package WeekOne;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public int largestPerimeter(int[] A) {
        Arrays.sort(A);
        int max=0;
        for(int i=0;i<A.length-2;i++){
            if(A[i]+A[i+1]>A[i+2] && A[i]+A[i+1]+A[i+2] >max){
                max=A[i]+A[i+1]+A[i+2];
            }
        }

        return max;

    }
}
