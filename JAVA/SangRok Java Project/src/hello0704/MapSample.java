package hello0704;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapSample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // key와 value를 연결해서 넣어줌
        map.put(1, "abc");
        map.put(2, "def");
        map.put(3, "ksb");
        map.put(4, "abc");
        map.put(5, "def");


        Set<Integer> kSet = map.keySet();
        for(Integer n : kSet){
            System.out.println(map.get(n));
        }

        System.out.println("-------------------");

        Iterator<Integer> iter = kSet.iterator();
        while(iter.hasNext()){
            Integer i = iter.next();
            System.out.println(i + ":" + map.get(i));
        }
        
        System.out.println("-------------------");

        // print the data of map
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));

        System.out.println("-------------------");

        // delete the data of map
        map.remove(1);
        System.out.println(map.get(1)); //null
        System.out.println(map.size()); //2
    }
}
