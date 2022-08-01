package hello0725;

import java.util.*;

public class ex11_10 {
    public static void main(String[] args) {
        Set set =  new HashSet();


        // set의 크기가 6이하일 동안 1~45 의 난수저장.
        for(int i = 0; set.size() < 6; i++) {
            int num = (int)(Math.random() *45) + 1;
            set.add(num);
        }

        // 정렬
        // * set은 정렬이 안된다.
        // => set의 모든 요소를 list에 저장한뒤 정렬.
        List list = new LinkedList(set);    //LinkedList(Collection c)
        Collections.sort(list);             //Collections.sort(List list)
        System.out.println(list);
    }
}
