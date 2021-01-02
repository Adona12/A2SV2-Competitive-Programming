package WeekOne;

import java.util.HashMap;
import java.util.Map;

public class SalesByMatch {

    static int sockMerchant(int n, int[] ar) {
        HashMap<Integer,Integer> values =new HashMap<>();

        for (int i = 0; i < ar.length; i++) {
            if (!values.containsKey(ar[i])){
                values.put(ar[i],1);
            }else{
                values.put(ar[i],values.get(ar[i])+1);
            }
        }
        int total=0;
        for(Map.Entry<Integer,Integer> entries:values.entrySet()){
            total+=entries.getValue()/2;
        }
        return total;
    }

}
