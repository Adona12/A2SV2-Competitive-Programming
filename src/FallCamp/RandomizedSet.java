package FallCamp;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class RandomizedSet {
        ArrayList<Integer> values;
        HashMap<Integer,Integer> map;
        Random rand;
        int size;
        public RandomizedSet() {
            values = new ArrayList<>();
            map = new HashMap<>();
            rand = new Random();
        }

        public boolean insert(int val) {
            if(map.containsKey(val)){
                return false;
            }
            values.add(val);
            map.put(val,values.size() - 1);
            return true;
        }

        public boolean remove(int val) {
            if(!map.containsKey(val)){
                return false;
            }

            values.set(map.get(val),values.get(values.size() - 1));
            map.put(values.get(values.size() - 1),map.get(val));
            values.remove(values.size() - 1);
            map.remove(val);
            return true;

        }

        public int getRandom() {
            int random = rand.nextInt(values.size() );
            return values.get(random);
        }

}
