package WeekTwo;

import java.util.ArrayList;
import java.util.List;

public class stackWithArray {
    public List<String> buildArray(int[] target, int n) {
        List<String> stack=new ArrayList<>();
        int num=1;
        int index=0;
        while(index<target.length){
            if(target[index]==num){
                stack.add("Push");
                index++;
            }
            else{
                stack.add("Push");
                stack.add("Pop");

            }
            num++;
        }
        return stack;
    }

}
