package hello0710;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class map {

    public static void main(String[] args) {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        
        map.put(1, 2);
        map.put(1, 3);
        map.put(1, 4);
        map.put(1, 4);
        map.put(1, 5);

        Set<Integer> kSet = map.keySet();

        Iterator<Integer> iter = kSet.iterator();

        while(iter.hasNext()){
            Integer k = iter.next();
            System.out.println(k + " : " + map.get(k));
        }

    
    }


}
