package WeekThree;

public class MergeSort {
    public static void main(String[] args) {
        int[] array={7,2,1,6,8,5,3,4};
        mergeSort(array);
        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }
    }
    public static void mergeSort(int[] array){

        if(array.length<=1){
            return;
        }
        int mid=array.length/2;
        int[] left=new int[mid];
        int[] right=new int[array.length-mid];
       for(int i=0;i< left.length;i++){
           left[i]=array[i];
       }
        for(int i=mid;i-mid< right.length;i++){
            right[i-mid]=array[i];
        }
        mergeSort(left);
        mergeSort(right);
        merge(left,right,array);
    }
    public static void merge(int[] left,int[] right,int[] array){
      int i=0,j=0,k=0;
      while(j<left.length && k<right.length){
          if(left[j]<right[k]){
              array[i]=left[j];
              i=i+1;
              j=j+1;
          }else{
              array[i]=right[k];
              i=i+1;
              k=k+1;
          }
      }
      while(j<left.length){
          array[i]=left[j];
          i=i+1;
          j=j+1;
      }
      while(k<right.length){
          array[i]=right[k];
          i=i+1;
          k=k+1;
      }

    }
}
