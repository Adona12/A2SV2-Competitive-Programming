package WeekFive;

import java.util.ArrayDeque;
import java.util.Queue;

public class RottingOranges {
    public int orangesRotting(int[][] grid) {
        int count = 0;
        int minute = 0;
        int[][] adjacent = new int[][]{new int[]{0,1},new int[]{1,0},new int[]{-1,0},new int[]{0,-1}};
        Queue<int[]> queue = new ArrayDeque<>();

        for( int i = 0; i < grid.length; i++){
            for( int j = 0; j < grid[i].length; j++){
                if( grid[i][j] == 2){
                    queue.add(new int[]{i,j});
                }
                else if( grid[i][j] == 1){
                    count++;
                }
            }
        }

        if( count == 0){
            return 0;
        }

        while( !queue.isEmpty()){
            int length = queue.size();
            for( int i = 0; i < length; i++){
                int[] temp = queue.remove();
                for(int j = 0; j < adjacent.length; j++){
                    int x = temp[0]+adjacent[j][0];
                    int y = temp[1]+adjacent[j][1];

                    if(x >= 0 && x < grid.length  && y >= 0   && y < grid[x].length){
                        if( grid[x][y] == 1){
                            grid[x][y] = 2;
                            queue.add(new int[]{x,y});
                        }
                    }
                }

            }
            if( queue.size() != 0){
                minute++;
            }

        }

        for( int i = 0; i < grid.length; i++){
            for( int j = 0; j < grid[i].length; j++){
                if( grid[i][j] == 1){
                    return -1;
                }
            }
        }
        return minute;
    }
}
