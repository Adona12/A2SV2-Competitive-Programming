package WeekOne;

import java.util.ArrayList;

public class IntersectionOfTwoArrays {


    public int[] intersection(int[] nums1, int[] nums2) {
        int[] a=new int[2];
        int max1=0;
        int max2=0;
        if(nums1.length!=0){
            max1=nums1[0];
        }
        if(nums2.length!=0){
            max2=nums2[0];
        }
        for(int i=0;i<nums1.length;i++){
            if(nums1[i]>max1){
                max1=nums1[i];
            }

        }
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]>max2){
                max2=nums2[i];
            }

        }
        System.out.println(max1+1);
        System.out.println(max2+1);
        int[] arr1=new int[max1+1];
        int[] arr2=new int[max2+1];
        for(int i=0;i<nums1.length;i++){
            arr1[nums1[i]]++;
        }
        for(int i=0;i<nums2.length;i++){
            arr2[nums2[i]]++;
        }


        int count=0;
        for(int i=0;i<(arr1.length>arr2.length?arr2.length:arr1.length);i++){
            if(arr1[i]!=0 && arr2[i]!=0){
                count++;
            }
        }
        int index=0;
        int[] sorted=new int[count];
        for(int i=0;i<(arr1.length>arr2.length?arr2.length:arr1.length);i++){
            if(arr1[i]!=0 && arr2[i]!=0){
                System.out.println(i);
                sorted[index]=i;
                index++;
            }
        }
        return sorted;
    }
}