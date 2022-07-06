package hello0705;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class review2 {
    public static void main(String[] args) {
            HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();

            map.put(1, 2);
            map.put(2, 2);
            map.put(3, 2);
            map.put(4, 2);
            map.put(5, 2);

            Set<Integer> kSet = map.keySet();

            Iterator<Integer> iter = kSet.iterator();

            while(iter.hasNext()){
                Integer k = iter.next();
                System.out.println(k + " : " + map.get(k));
            }
    }
    
}
