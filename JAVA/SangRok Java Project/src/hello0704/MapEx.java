package hello0704;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;



public class MapEx {
    public static void main(String[] args) {
        HashMap<Integer, Person> map = new HashMap<Integer, Person>();

        map.put(1, new Person("John", 19));
        map.put(2, new Person("Sam", 34));
        map.put(3, new Person("K", 27));
        map.put(4, new Person("V", 25));
        map.put(5, new Person("Owen", 33));

        Set<Integer> kSet = map.keySet();

        Iterator<Integer> iter = kSet.iterator();

        while (iter.hasNext()) {
            Integer i = iter.next();
            System.out.println(i + " : " + map.get(i));
        }
    }
}
