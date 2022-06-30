package hello0630;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;

public class Twoway {
    public static void main(String[] args) {
        List <String> list = Arrays.asList("AAA", "BBB", "CCC", "DDD");
        // Conversion
        list = new ArrayList<String>(list);

        // get two-way Iterator.
        ListIterator <String> iter = list.listIterator();


        // print list =>
        String s = null;
        System.out.println("=> 방향");
        while(iter.hasNext()) {
            s = iter.next();
            System.out.println(s);

            // s가 "AAA"이라면 "AAA2"를 추가한다.
            if(s.equals("AAA")){
                iter.add("AAA2");
                // + tree구조가 아닌 선형 구조라면 넣을 수 있다!
                // + list.add(s); 는 에러 발생
            }
        }
        // print list <=
        System.out.println("<= 방향");
        while(iter.hasPrevious()){
            s = iter.previous();
            System.out.println(s);
        }


        System.out.println("-------------------");


        // again print.
        while(iter.hasNext()) {
            s = iter.next();
            System.out.println(s);
        }


        // 기본적으로 안 사용하는게 몸에 좋다. 복잡성 이슈
        // 오히려 단방향 두개를 사용하는것이 좋다.
    }
}
