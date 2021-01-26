package WeekFour;

import java.util.Comparator;
import java.util.PriorityQueue;

public class LastStone {

    public static void main(String[] args) {
        System.out.println( Integer.max(5,3));
        String s="dff";

    }
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>(Comparator.reverseOrder());
        for(int i=0;i<stones.length;i++){
            maxHeap.add(stones[i]);
        }
        while(maxHeap.size()>1){
            int x=maxHeap.remove();
            int y=maxHeap.remove();
            if(x!=y){
                maxHeap.add(x-y);
            }

        }

        if(maxHeap.size()==1){
            return maxHeap.remove();
        }
        return 0;

    }
}
