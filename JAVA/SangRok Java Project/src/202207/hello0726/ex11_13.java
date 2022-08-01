package hello0726;

import java.util.*;

public class ex11_13 {
    public static void main(String[] args) {
        Set set = new TreeSet();    // 범위 검색, 자동 정렬됨.

        for (int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random() *45) +1;
            set.add(num);   // set.add(new Integer(num))
        }

        System.out.println(set);
    }
}
