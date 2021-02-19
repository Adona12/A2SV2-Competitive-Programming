package WeekThree;

import java.util.Scanner;

public class HeapSort {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */

        Scanner scanner=new Scanner(System.in);
        int x= scanner.nextInt();
        Heap heap=new Heap(x);

        scanner.nextLine();
        String y=scanner.nextLine();
        String[] z=y.split(" ");
        for(int i=0;i<z.length;i++){
            heap.insert(Integer.parseInt(z[i]));
            //   System.out.println(z[i]);
        }
        int[] s=new int[x];
        System.out.print("[");
        for(int i=0;i<s.length;i++){
            System.out.print(heap.remove());
            if(i<s.length-1){
                System.out.print(",");
            }
        }
        System.out.print("]");



    }

}

class Heap{
    int[] heap;
    int index=0;
    int size=0;
    public Heap(int size){
        this.heap=new int[size];
        this.size=size;
    }
    public int peek(){
        return heap[0];
    }
    public int size(){
        return index;
    }
    public void insert(int data){


        int addedIndex=0;

        if(heap[0]==0){
            heap[0]=data;
        }
        else {
            if(index<size){
                heap[index]=data;
                addedIndex=index;

            }

            int placeHolder=0;
            while(addedIndex>0){
                if(heap[(addedIndex-1)/2] <=heap[addedIndex]){
                    break;
                }else{
                    // System.out.println("swap "+heap[addedIndex]+"and "+heap[(addedIndex-1)/2]);
                    placeHolder=heap[addedIndex];
                    heap[addedIndex]=heap[(addedIndex-1)/2];
                    heap[(addedIndex-1)/2]=placeHolder;
                    addedIndex=(addedIndex-1)/2;

                }
            }
        }
        index++;
    }
    void print(){
        for(int i=0;i<heap.length;i++){
            System.out.println(heap[i]);
        }
    }
    static void quickSort(int[] array, int start,int end){
        int pIndex=end;
        int pivot=start;
        if(end<=start){
            return;
        }
        else{

            for(int i=end;i>start;i--){
                if(array[i]>=array[pivot]){
                    int temp=array[i];
                    array[i]=array[pIndex];
                    array[pIndex]=temp;
                    pIndex--;
                }
            }
            int temp=array[pivot];
            array[pivot]=array[pIndex];
            array[pIndex]=temp;
        }
        quickSort(array,start,pIndex-1);
        quickSort(array,pIndex+1,end);

    }

    public int remove(){
        if(index==0){
            return 0;
        }
        else{
            int data=heap[0];
            if(index>1){
                heap[0]=heap[index-1];
                heap[index-1]=0;
                int min=0;
                int placeHolder=0;
                int tempo=0;
                while(placeHolder<index-1 ){
                    int nextIndex=2*placeHolder+1;
                    // System.out.println("next index "+nextIndex);
                    if(heap[2*placeHolder+2]<heap[nextIndex]){
                        nextIndex=2*placeHolder+2;
                    }
                    if(nextIndex<index-1 && heap[nextIndex]<heap[min]){
                        //  System.out.println("swap "+heap[nextIndex]+" and "+heap[min]);
                        tempo=heap[nextIndex];
                        heap[nextIndex]=heap[min];
                        heap[min]=tempo;
                        min=nextIndex;
                        placeHolder=nextIndex;

                    }

                    else{
                        break;
                    }

                }
            }
            else{
                heap[0]=0;
            }
            index--;

            return data;
        }



    }

    public boolean isEmpty(){
        if(index==0){
            return true;
        }
        return false;
    }
}
