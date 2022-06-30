package hello0630;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class conversion {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("AAA", "BBB", "CCC");
        // + 완벽한 Arraylist는 아니다!
        // + 용량을 늘이거나 줄이거나 할 수 없다.
        // + 편리성 때문에 사용한다.

        list = new ArrayList<>(list);
        // 새롭게 참조하여 용량의 변경이 가능하다.
        

        list = new LinkedList<>(list);
        // LinkedList로도 Conversion이 가능하다!
        // 즉 계속해서 Conversion이 가능하다!



        list.add("DDD");



        for(String s : list) {
            System.out.println(s);
        }
    }
}
