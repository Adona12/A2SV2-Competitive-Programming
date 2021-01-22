package WeekThree;

import java.util.*;

public class SortArrayByIncreasingFrequency {
    public static void main(String[] args) {
        //int[] j = {-1,1,-6,4,5,-6,1,4,1};
     //   int[] j = {2,3,1,3,2};
        int[] j = {1,1,2,2,2,3};
        sortArray(j);
    }

    static void sortArray(int[] array) {
        HashMap<Integer, Integer> elements = new HashMap<>();
        int count = 0;
        for (int i = 0; i < array.length; i++) {
           // System.out.println(array[i]);
            if (elements.containsKey(array[i])) {
               // System.out.println("contains");
                elements.put(array[i], elements.get(array[i]) + 1);
            } else {
                elements.put(array[i], 1);
                count++;
            }
        }
        //  List keys=new ArrayList();
        int k = 0;
        int[] keys = new int[count];
        int[] values = new int[count];
        int max = 0;
        for (Map.Entry<Integer, Integer> entry : elements.entrySet()) {
            keys[k] = entry.getKey();
            values[k] = entry.getValue();
            if (values[k] > max) {
                max = entry.getValue();
            }
             // System.out.println("keys " + keys[k] + " values" + values[k]);
            k++;
        }
        for (int i = 0; i < keys.length; i++) {
            //  System.out.println("keys " + keys[i] + " values" + values[i]);
        }
        Arrays.sort(keys);
//        for (int i = 0; i < keys.length; i++) {
//            System.out.println("keys " + keys[i] + " values" + values[i]);
//        }
        int index = 0;
        int[] sorted = new int[array.length];
        for (int i = 1; i <=max ; i++) {
          //     System.out.println("max "+i);
            for (int j = keys.length - 1; j >= 0; j--) {
                if (elements.get(keys[j]) == i) {
                    //     System.out.println("keys "+keys[j]+" values"+values[j] +" max"+i);
                    for (int l = 0; l < i; l++) {

                        sorted[index] = keys[j];
                        //      System.out.println("index" +index+" element "+sorted[index]);
                        index++;
                    }
                }
            }
         }
          for(int i=0;i<sorted.length;i++){
              System.out.println(sorted[i]);
          }


    }
}
