package WeekOne;

import java.util.Arrays;

public class RelativeSortArray {
    public static void main(String[] args) {
        int[] j = {7,3,5,29,19};
        Arrays.sort(j);
        System.out.println(binarySearch(j,17));
    }
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        Arrays.sort(arr1);
        int max=0;
        for(int i=0;i<arr1.length;i++){
            if(max<arr1[i]){
                max=arr1[i];
            }
        }
        int[] count=new int[max+1];
        int[] sorted=new int[arr1.length];
        for(int i=0;i<arr1.length;i++){
            count[arr1[i]]=count[arr1[i]]+1;
        }
        int index=0;
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<count[arr2[i]];j++){
                sorted[index]=arr2[i];

                index++;
            }
        }
        Arrays.sort(arr2);
        Boolean found=false;
        for(int i=0;i<arr1.length;i++){
//             found=false;
//             for(int j=0;j<arr2.length;j++){
//                 if(arr1[i]==arr2[j]){
//                     found=true;
//                     break;

//                 }
            found=binarySearch(arr2,arr1[i]);

            //}


            if(!found){
                sorted[index]=arr1[i];
                if(index!=sorted.length-1){
                    index++;
                }
            }
        }
        return sorted;

    }
    public static  Boolean binarySearch(int[] arr,int target){
        int firstBound=0;
        int secondBound=arr.length-1;
        int mid;
        while(firstBound<=secondBound){
            mid=(firstBound+secondBound)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]>target){
                secondBound=mid-1;
            }
            else if(arr[mid]<target){
                firstBound=mid+1;
            }
        }

        return false;
    }
}
