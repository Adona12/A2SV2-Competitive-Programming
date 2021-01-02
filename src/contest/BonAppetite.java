package contest;

import java.util.List;

public class BonAppetite {
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int theWhole=0;
        int excluded=0;
        for(int i=0;i<bill.size();i++){
            if(i!=k && i!=b){
                excluded+=bill.get(i);
            }
        }
        if((excluded/2)==b){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(b-excluded/2);
        }

    }
}
