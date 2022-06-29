package hello0629;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Iter {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(15000);

        // 리스트에 데이터를 입력한다.
        list.add("abc");
        list.add("kbs");
        list.add("JSR");
        list.add("ZZZ");

        Iterator<String> iter = list.iterator();
        String temp = null;

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("-------------------------------------------------------------");

        // 삭제
        iter = list.iterator();
        while(iter.hasNext()) {
            // temp에 데이터를 저장
            temp = iter.next();
            // temp에 데이터가 같다면 remove
            if(temp.equals("ZZZ")){
                iter.remove();
            }
        }

        System.out.println("-------------------------------------------------------------");
        

        // 다시 출력하기 위해서는 Iterator를 다시 받아 출력.
        // 이는 동일한 순환 인터페이스를 제공한다. (list, que...)
        iter = list.iterator();
        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("-------------------------------------------------------------");
    }

}
