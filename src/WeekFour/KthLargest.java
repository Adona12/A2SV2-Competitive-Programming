package WeekFour;

import java.util.PriorityQueue;

class KthLargest {
    PriorityQueue<Integer> minHeap= null;
    int k = 0;
    int count = 0;
    public KthLargest(int k, int[] nums) {
        minHeap=new PriorityQueue<>();
        this.k=k;
        for(int i = 0; i < nums.length; i++){
            if(i >= k){
                if( nums[i] > minHeap.peek()){
                    minHeap.remove();
                    minHeap.add(nums[i]);

                }

            }
            else{
                minHeap.add(nums[i]);

            }

            count++;
        }

    }



    public int add(int val) {
        if(minHeap.isEmpty()){
            minHeap.add(val);
        }
        else if(val > minHeap.peek() && count >= k){
            minHeap.remove();
            minHeap.add(val);
        }
        else{
            if(count < k){
                minHeap.add(val);
            }
        }
        count++;
        return minHeap.peek();
    }
}