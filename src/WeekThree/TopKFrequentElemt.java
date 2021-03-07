package WeekThree;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class TopKFrequentElemt {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer,Integer> freqNums = new HashMap<Integer,Integer>();
        for(int i = 0; i < nums.length; i++){
            if(freqNums.containsKey(nums[i])){

                freqNums.put(nums[i],(freqNums.get(nums[i]) + 1));
            }else{

                freqNums.put(nums[i],1);
            }

        }


        PriorityQueue<Number> maxheap = new PriorityQueue<Number>(new Comparator<Number>(){
            @Override
            public int compare(Number num1,Number num2){
                if(num1.frequency > num2.frequency){
                    return -1;
                }
                else  if(num1.frequency < num2.frequency){
                    return 1;
                }else{
                    return 0;
                }
            }

        });


        for(Map.Entry<Integer,Integer> entry : freqNums.entrySet()){
            maxheap.add(new Number(entry.getKey(),entry.getValue()));
        }
        int[] result = new int[k];
        int counter = 0;
        for(int i = 0; i < k; i++){
            Number temp = maxheap.poll();

            result[counter] = temp.element;
            counter++;

        }
        return result;
    }
}
class Number{
    int element;
    int frequency;
    Number(int element,int frequency){
        this.element=element;
        this.frequency=frequency;
    }
}


