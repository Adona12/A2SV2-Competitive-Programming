package WeekOne;

public class BubbleSort {
    public static void main(String[] args) {
        int[] j={-2,2,1,0,4,5,6,2};
        bubbleSort(j);
    }
    public static void bubbleSort(int arr[]) {
     for(int i=0;i<arr.length;i++){
        for(int j=1;j<arr.length-i;j++){
            if(arr[j-1]>arr[j] ){
                int temp=arr[j-1];
                arr[j-1]=arr[j];
                arr[j]=temp;
            }
            for(int k=0;k<arr.length;k++){
                System.out.print(arr[k]+"  ");

            }
        }
     }
     for(int i=0;i<arr.length;i++){
         System.out.println(arr[i]);
     }
    }

}
