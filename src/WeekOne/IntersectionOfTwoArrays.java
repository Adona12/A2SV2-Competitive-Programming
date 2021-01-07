package WeekOne;

import java.util.ArrayList;

public class IntersectionOfTwoArrays {


    public static void main(String[] args) {
        ArrayList<Integer> hold=new   ArrayList<Integer>();
        hold.add(2);
        hold.add(2);
        hold.add(3);
        hold.add(2);
        hold.add(3);
        hold.add(2);
        hold.add(3);
        hold.add(2);

        for(int i=0;i<hold.size();i++){
            for(int j=i;j<hold.size();j++){
                if(hold.get(i)==hold.get(j) && i!=j){
                    hold.remove(j);
                    j--;

                }
            }

        }
        for(int i=0;i<hold.size();i++){
            System.out.println(hold.get(i));
        }
    }
    public int[] intersection(int[] nums1, int[] nums2) {
        ArrayList<Integer> hold=new   ArrayList<Integer>();
        Boolean found=false;
        for(int i=0;i<nums2.length;i++){
            for(int j=0;j<nums1.length;j++){
                if(nums2[i]==nums1[j]){
                    found=false;
                    //   System.out.println("equal "+nums2[i]+" and "+nums1[j]);
                    for(int k=0;k<hold.size();k++){
                        if (nums1[i]==hold.get(k)){
                            found=true;
                            break;
                        }
                    }
                    if(!found){
                        hold.add(nums2[i]);
                    }

                    break;
                }

            }

        }
        for(int i=0;i<hold.size();i++){
            int check=i;
            for(int j=i-1;j>=0;j--){
                if(hold.get(check)<hold.get(j)){
                    int temp=hold.get(j);
                    hold.set(j,hold.get(check));
                    hold.set(check,temp);

                    check=j;
                }
            }


        }
        for(int i=0;i<hold.size();i++){
            if(i!=0){
                System.out.println("now"+hold.get(i));
                System.out.println("before"+hold.get(i-1));
            }
            if(i!=0 && hold.get(i)==hold.get(i-1)){
                hold.remove(i);
                i--;
            }
        }
        int[] output=new int[hold.size()];
        for(int i=0;i<hold.size();i++){
            output[i]=hold.get(i);
        }
        return output;
    }
}