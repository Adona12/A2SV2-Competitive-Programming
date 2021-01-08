package WeekOne;

public class InsertionSort {
    public static void main(String[] args) {
        int[] j={-2,2,1,-3,0,4,5,6,2};
        int[] k={12,3,4,2,0,1};
        insertionSort(j);
    }
   public static void insertionSort(int[] arr){
       int check;
       for(int i=1;i< arr.length;i++){
            check=i;
           for(int j=i-1;j>=0;j--){
               System.out.println("check "+arr[check]+"  "+arr[j]);
               System.out.println("index "+check+"  "+j);
               if(arr[check]<arr[j]){
                   System.out.println("swap "+arr[check]+"  "+arr[j]);
                   int temp=arr[j];
                   arr[j]=arr[check];
                   arr[check]=temp;
                   check=j;
               }
           }
       }

       for(int i=0;i<arr.length;i++){
           System.out.println(arr[i]);
       }
   }
}

