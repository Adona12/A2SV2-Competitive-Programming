package WeekThree;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class RecentCounter {

        List<Integer> recent=new ArrayList<>();
        public RecentCounter() {
            recent=new ArrayList<>();
        }

        public int ping(int t) {

            recent.add(t);
            int low=t-3000;
            int high=t;
            recent.sort(Comparator.naturalOrder());
            for(int i=0;i<recent.size();i++){
                if(recent.get(i)<low){
                    recent.remove(i);
                    i--;
                }

            }
            return recent.size();
        }

    }

