package hello0727;

import java.util.*;

public class exercise11_1 {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();   //ArrayList : 중복O, 순서 저장 유지
        list.add(3);
        list.add(6);
        list.add(2);
        list.add(2);
        list.add(2);
        list.add(7);
        
        HashSet set = new HashSet(list);    //HashSet : 순서X, 중복X, 제거유리      // 3, 6, 2, 7
        TreeSet tSet = new TreeSet(set);    //TreeSet : 정렬O, 범위탐색O            // 3, 6, 2, 7
        Stack stack = new Stack();          //Stack : FILO구조 
        stack.addAll(tSet);

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }

    }
}
