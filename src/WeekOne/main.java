package WeekOne;

import java.util.Arrays;
import java.util.PriorityQueue;

public class main {
    public static void main(String[] args) {
        int[] temp= {2,7,11,15};
        int[] temp1={12,3,9,1,6,4};
        triple(temp1,18);
     //   twoSum(temp,9);
    }
    public static int[] twoSum(int[] nums, int target) {
        int x[]=new int[2];

        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]+nums[j]==target && !(i==j)){
                    x[0]=i;
                    x[1]=j;
                }
            }
        }

        return x;
    }
    public static boolean triple(int[] array, int value){
        if(array.length<3){
            return false;
        }

        Arrays.sort(array);
        int n=array.length;
        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = array[i];
            array[i] = array[n - i - 1];
            array[n - i - 1] = t;
        }
        int length=array.length;
        System.out.println("max "+array[0]);
        int first=array[0];
        int second=array[1];
        int third=array[2];
        int counter1=2;
        int counter2=2;
        int temp=third;
        int userIndexthird=0;
        int userIndexsecond=0;
        while(counter1>=0){
            System.out.println("counter1 "+counter1);
            System.out.println("counter2 "+counter1);

            if(counter2>=length ){
               length--;
                counter1--;

                counter2=counter1;

            }
            if(counter1<0){
                return false;
            }
            int answer=first+second+third;
            if(answer==value){
                System.out.println(first);
                System.out.println(second);
                System.out.println(third);
                return true;
            }
            else if(answer>value){

                System.out.println("counter2 "+counter2);
                temp=array[counter2];

                if(counter1==2){
                    userIndexthird=counter2;
                    counter2++;

                    third=temp;
                }else if(counter1==1 && counter2!=userIndexthird){
                    userIndexsecond=counter2;
                    counter2++;

                    second=temp;
                }
                else if(counter1==0 && counter2!=userIndexsecond){
                    first=temp;
                    counter2++;
                }
            }
            else{
                counter1=2;

                temp=array[counter2];
                if(counter1==2){
                    userIndexthird=counter2;
                    counter2++;

                    third=temp;
                }else if(counter1==1 && counter2!=userIndexthird){
                    userIndexsecond=counter2;
                    counter2++;

                    second=temp;
                }
                else if(counter1==0 && counter2!=userIndexsecond){
                    first=temp;
                    counter2++;
                }
            }
            System.out.println("counter2 second "+counter2);
        }
        return false;


    }





}
