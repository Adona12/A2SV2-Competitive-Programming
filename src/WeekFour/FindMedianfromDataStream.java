package WeekFour;

import java.util.Comparator;
import java.util.PriorityQueue;

public class FindMedianfromDataStream {
    PriorityQueue<Integer> minHeap;
    PriorityQueue<Integer> maxHeap;
    public FindMedianfromDataStream() {
        minHeap = new PriorityQueue<>();
        maxHeap = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addNum(int num) {
        if( (minHeap.isEmpty() && maxHeap.isEmpty()) ){
            minHeap.add(num);

        }else if(maxHeap.size() < minHeap.size() ){
            if(num > minHeap.peek()){
                maxHeap.add(minHeap.remove());
                minHeap.add(num);
            }
            else{
                maxHeap.add(num);
            }
        }
        else if( maxHeap.size() > minHeap.size()){
            if(num < maxHeap.peek()){
                minHeap.add(maxHeap.remove());
                maxHeap.add(num);
            }
            else{
                minHeap.add(num);
            }

        }
        else{
            if(num > minHeap.peek()){
                minHeap.add(num);
            }
            else if(num < maxHeap.peek()){
                maxHeap.add(num);
            }
            else{
                minHeap.add(num);
            }
        }
    }

    public double findMedian() {
        if(minHeap.size()== maxHeap.size()){
            return  (Double.valueOf(minHeap.peek())+ Double.valueOf(maxHeap.peek()))/2;
        }
        else if(maxHeap.size() > minHeap.size()){
            return  Double.valueOf(maxHeap.peek());
        }

        return Double.valueOf(minHeap.peek());
    }
}
