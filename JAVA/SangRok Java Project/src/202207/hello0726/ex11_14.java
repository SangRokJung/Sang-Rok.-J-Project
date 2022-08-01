package hello0726;

import java.util.*;

public class ex11_14 {
    public static void main(String[] args) {
        TreeSet set = new TreeSet();

        String from = "b";
        String to   = "d";

        set.add("abc"); set.add("car"); set.add("dance");
        set.add("elephant"); set.add("flower"); set.add("alien");
        set.add("Car"); set.add("dZZZZ"); set.add("elevator");
        set.add("bat"); set.add("dzzzz");

        System.out.println(set);
        System.out.println("range serch : from " + from + " to " + to);
        System.out.println("result1 : " + set.subSet(from, to));    // 전체 집합중 부분집합만 추출
        System.out.println("result2 : " + set.subSet(from, "dzzz"));
    }
}
