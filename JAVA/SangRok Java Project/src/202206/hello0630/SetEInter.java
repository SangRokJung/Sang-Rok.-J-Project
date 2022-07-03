package hello0630;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;



public class SetEInter {
    public static void main(String[] args) {
        // Set
        // - 저장 순서의 개념이 없다.
        // - 데이터의 중복을 허용하지 않는다.
        Set <String> set = new HashSet<>();
        
        set.add("abc1");
        set.add("abc2");
        set.add("abc3");
        set.add("abc3");
        

        System.out.println("set의 item 개수 = " + set.size());


        for(Iterator<String> it = set.iterator(); it.hasNext();){
            System.out.println(it.next());
        }


    }
}
