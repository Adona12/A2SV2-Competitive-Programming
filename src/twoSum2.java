import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class twoSum2 {
    public static void main(String[] args) {
        int[] temp= {2,5,5,11};
        twoSum(temp,10);
    }
    public static int[] twoSum(int[] arr,int target){
        ArrayList<Integer> original=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            original.add(arr[i]);
        }
      Arrays.sort(arr);

        int i=0;
        int j=arr.length-1;
        int num1=arr[i];
        int num2=arr[j];
       while(true) {
           int total = arr[i] + arr[j];
           if (total == target) {
               break;
           } else if (i == arr.length - 1) {
               break;
           } else if (total > target) {
               j--;
           } else if (total < target) {
               i++;
               j = arr.length - 1;
           }
       }
       int firstIndex=0;
       int secondIndex=0;
       Boolean foundFirst=false;
       Boolean foundSecond=false;
       for(int k=0;k<original.size();k++){
           if(arr[i]==original.get(k)&& !foundFirst) {
               foundFirst = true;
               firstIndex=k;
           }else if(arr[j]==original.get(k)&& !foundSecond){
               System.out.println("second here");
                  foundSecond=true;
                  secondIndex=k;
               }
           }
        int x[]=new int[2];
       x[0]=firstIndex;
       x[1]=secondIndex;
       return x;
       }

//        System.out.println(Arrays.asList(nums));
//       for(int k=0;k<nums.length;k++){
//           System.out.println(nums[k]);
//       }
//        System.out.println(nums.indexOf(3));
//        System.out.println(nums.indexOf(arr[j]));

    }

