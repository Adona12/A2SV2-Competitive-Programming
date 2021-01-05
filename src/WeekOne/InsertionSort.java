package WeekOne;

public class InsertionSort {
    public static void main(String[] args) {
        int[] j={-2,2,1,-3,0,4,5,6,2};
        int[] k={1,12,3,4,2,0,1};
        insertionSort(k);
    }
   public static void insertionSort(int[] arr){
       for(int i=0;i< arr.length;i++){
           for(int j=0;j<i;j++){
               if(arr[i]<arr[j]){
                   int temp=arr[j];
                   arr[j]=arr[i];
                   arr[i]=temp;
               }
           }
       }
       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
   }
}

