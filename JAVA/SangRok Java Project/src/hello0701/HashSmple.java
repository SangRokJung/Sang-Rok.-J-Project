package hello0701;

import java.util.HashSet;
import java.util.Iterator;

public class HashSmple {
    public static void main(String[] args) {
        // 1. HashSet을 만든다.
        HashSet<IntValue> hset = new HashSet<>();

        // 2. IntVlaue 1, 2, 3, 4, 5, 5를 넣는다.
        hset.add(new IntValue(1));
        hset.add(new IntValue(2));
        hset.add(new IntValue(3));
        hset.add(new IntValue(4));
        hset.add(new IntValue(4));
        hset.add(new IntValue(5));
        hset.add(new IntValue(5));

        // 3. HashSet의 데이터 수를 확인한다.
        System.out.println("Data Count = " + hset.size());

        // 4. 반복자를 이용하여 출력한다.
        Iterator<IntValue> iter = hset.iterator();
        IntValue val = null;

        while(iter.hasNext()){
            val = iter.next();
            System.out.println(val);
        }




    }
}
