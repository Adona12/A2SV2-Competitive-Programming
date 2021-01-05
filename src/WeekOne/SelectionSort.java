package WeekOne;

public class SelectionSort {
    public static void main(String[] args) {
        int[] j={-2,2,1,0,4,5,6,2};
        selectionSort(j);
    }
    public static void selectionSort(int arr[]) {

        for(int i=0;i<arr.length;i++){
            int index =i;
            int min=arr[i];
            for(int j=i;j<arr.length;j++){
                if(min>arr[j]){
                   min=arr[j];
                   index=j;
                }
            }
            if(index!=i){
                int temp=arr[index];
                arr[index]=arr[i];
                arr[i]=temp;
            }

        }
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
