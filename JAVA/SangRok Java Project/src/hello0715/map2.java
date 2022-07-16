package hello0710;

import java.util.HashMap;
import java.util.Set;

public class map2 {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();

        // key and value를 연결해서 넣어준다.
        map.put(1, "abc");
        map.put(2, "asd");
        map.put(3, "wwq");
        map.put(4, "bgr");
        map.put(5, "bbb");

        Set<Integer> Kset = map.keySet();
        for(Integer i : Kset){
            System.out.println(map.get(i));
        }

        // print the data of map
        System.out.println(map.get(1));
        System.out.println(map.get(2));
        System.out.println(map.get(3));


        // delete the data of map
        map.remove(1);
        System.out.println(map.get(1)); //null
    }
}
