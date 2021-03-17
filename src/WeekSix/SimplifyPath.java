package WeekSix;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Stack;

public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> order = new Stack<>();
        List<String> result = new ArrayList<>();
        String[] x = path.split("/");
        for( int i = 0; i < x.length; i++){
            if(!x[i].equals("..") && !x[i].equals(".") && !x[i].equals("")){
                order.push(x[i]);
            }else if(x[i].equals("..") && !order.isEmpty()){

                order.pop();
            }
        }
        while(!order.isEmpty()){
            result.add(order.pop());
        }

        Collections.reverse(result);
        return ("/"+String.join("/",result));
    }
}
