package DailyQuestions;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class FindKPairsWithSmallestSums {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> result = new ArrayList<>();
        if(nums1.length==0 || nums2.length==0){
            return result;
        }

        PriorityQueue<Pair> minHeap = new PriorityQueue<Pair>(nums1.length*nums2.length,new Comparator<Pair>(){
            @Override
            public int compare(Pair p1, Pair p2){
                int p1Sum = p1.value1 + p1.value2;
                int p2Sum = p2.value1 + p2.value2;
                if(p1Sum > p2Sum){
                    return 1;
                }
                else if(p1Sum < p2Sum){
                    return -1;
                }
                else {
                    return 0;
                }
            }
        });

        for(int i = 0;i < nums1.length; i++){

            for(int j = 0;j < nums2.length; j++){
                minHeap.add(new Pair(nums1[i],nums2[j]));
            }
        }
        Pair temp=null;
        List<Integer> tempList=null;
        for(int i =0; i < k; i++){
            if(minHeap.size()==0){
                break;
            }
            temp=minHeap.poll();
            tempList = new ArrayList<>();
            tempList.add(temp.value1);
            tempList.add(temp.value2);
            result.add(tempList);
        }





        return result;
    }
}
class Pair{
    int value1;
    int value2;
    Pair(int value1,int value2){
        this.value1=value1;
        this.value2=value2;
    }
}
