package WeekOne;

import java.util.ArrayList;

public class MatrixCellsInOrder {
    public int[][] allCellsDistOrder(int R, int C, int r0, int c0) {
        int[][] matrix=new int[R*C][2];
        int[] count=new int[R*C];
        int y=0;
        int index=0;
        for(int x=0;x<R;x++){
            y=0;
            while(y<C){
                matrix[index][0]=x;
                matrix[index][1]=y;
                count[index]=Math.abs((x-r0))+Math.abs((y-c0));
                y++;
                index++;
            }
        }
        int check;
        for(int i=1;i<count.length;i++){
            // System.out.println("count " +count[i]);
            //  System.out.println("(" +matrix[i][0]+","+matrix[i][1]+")");
            check=i;
            for(int j=i;j>=0;j--){
                if(count[check]<count[j]){
                    int temp=count[check];
                    count[check]=count[j];
                    count[j]=temp;
                    int tempx=matrix[check][0];
                    int tempy=matrix[check][1];
                    matrix[check][0]=matrix[j][0];
                    matrix[check][1]=matrix[j][1];
                    matrix[j][0]=tempx;
                    matrix[j][1]=tempy;
                    check=j;
                }
            }
        }
        return matrix;
    }

        }

