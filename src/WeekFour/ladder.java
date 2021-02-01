package WeekFour;

import java.util.Comparator;
import java.util.PriorityQueue;

public class ladder {



        public int furthestBuilding(int[] heights, int bricks, int ladders) {
            int[] diffs=new int[heights.length-1];
            int index=0;
            int total=0;

            for(int i=1;i<heights.length;i++){
                diffs[index]=heights[i]-heights[i-1];
                index++;
            }
            PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Comparator.reverseOrder());
            for(int i=0;i<diffs.length;i++){
                if(diffs[i]>0){
                    if(bricks>=diffs[i]){
                        bricks-=diffs[i];

                    }
                    else if(ladders>0){
                        for(int j=0;j<i;j++){
                            maxHeap.add(diffs[j]);
                        }
                        int maxi=maxHeap.remove();
                        ladders--;
                        bricks+=maxi;

                    }
                }
            }
return 0;
        }
    }