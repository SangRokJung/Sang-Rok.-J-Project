package hello0721;

import java.util.*;

public class Ex11_5 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();

        // Collection Class를 변경
        // HashSet<String> list = new HashSet<String>();
        // Set은 Collection의 자손
        // Collection의 method만 사용했기 때문에 아래 코드를 검토할 필요 없다.

        // 더 유연한 코드
        Collection<String> c = new TreeSet<String>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
        list.add("5");

        Iterator<String> it = list.iterator();

        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }

        while(it.hasNext()) {
            Object obj = it.next();
            System.out.println(obj);
        }
    }
}
