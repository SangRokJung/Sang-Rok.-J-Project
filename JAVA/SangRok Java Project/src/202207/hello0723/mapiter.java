package hello0723;

import java.util.*;

public class mapiter {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<String, String>();

        map.put("english", "hi");
        map.put("korean", "안녕");

        Iterator<String> iter = map.keySet().iterator();

        while (iter.hasNext()) {
            String s = iter.next();
            System.out.println(map.get(s));
        }

    }
}
