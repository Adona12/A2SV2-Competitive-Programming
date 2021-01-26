package WeekThree;

import java.util.Comparator;
import java.util.List;

public class QuickSort {

    public static void main(String[] args) {
        int[] j={7,2,1,6,8,5,3,4};
        System.out.println((8-1)/2);


quickSort(j);
    }
    public static void quickSort(int[] array){
        quickSort(array,0,array.length-1);
//        for(int i=0;i<array.length;i++){
//                System.out.println(array[i]);
//        }
    }
    public static void quickSort(int[] array, int start,int end){
        System.out.println(start);
        System.out.println(end);
        int pIndex=start;
        int pivot=end;
        if(end<=start){
            return;
        }
        else{

            for(int i=start;i<end;i++){

                if(array[i]<=array[pivot]){
                    int temp=array[i];
                    array[i]=array[pIndex];
                    array[pIndex]=temp;
                    pIndex++;
                }
            }
            int temp=array[pivot];
            array[pivot]=array[pIndex];
            array[pIndex]=temp;
        }

        quickSort(array,start,pIndex-1);
        quickSort(array,pIndex+1,end);

    }
//public static void quickSort(int[] array, int start,int end){
//    int pIndex=end;
//    int pivot=start;
//    if(end<=start){
//        return;
//    }
//    else{
//
//        for(int i=end;i>start;i--){
//            if(array[i]>=array[pivot]){
//                int temp=array[i];
//                array[i]=array[pIndex];
//                array[pIndex]=temp;
//                pIndex--;
//            }
//        }
//        int temp=array[pivot];
//        array[pivot]=array[pIndex];
//        array[pIndex]=temp;
//    }
//      quickSort(array,start,pIndex-1);
//    quickSort(array,pIndex+1,end);
//
//}
}
