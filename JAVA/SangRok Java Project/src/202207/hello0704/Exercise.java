package hello0704;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;



public class Exercise {
    public static void main(String[] args) {
        // 가장 간단한 방법
        ArrayList<str> list = new ArrayList<>();

        list.add(new str("abc"));
        list.add(new str("abc"));
        list.add(new str("def"));
        list.add(new str("def"));
        list.add(new str("str"));

        HashSet<str> tempSet = new HashSet<>(list);

        List<str> list2 = new ArrayList<str>(tempSet);

        for(str s : list2){
            System.out.println(s);
        }        


        System.out.println("-------------------");



        // 같은 문자열이 있는지 검사해서 있다면 제거한다.
        ArrayList<str> aList2 = new ArrayList<str>();
        
        aList2.add(new str("abc"));
        aList2.add(new str("abc"));
        aList2.add(new str("def"));
        aList2.add(new str("def"));
        aList2.add(new str("stx"));

        for(int i=0; i<aList2.size() - 1; i++){
            for(int j=i+1; j<aList2.size(); j++){
                if(aList2.get(i).equals(aList2.get(j))){
                    aList2.remove(i);
                }
            }
        }

        Iterator<str> iter3 = aList2.iterator();
        while(iter3.hasNext()) {
            System.out.println(iter3.next());
        }



        System.out.println("-------------------");





        // HashSet을 이용해서 중복을 없애는 방법.
        HashSet<str> hset = new HashSet<>();
        ArrayList<str> aList = new ArrayList<>();

        hset.add(new str("abc"));
        hset.add(new str("abc"));
        hset.add(new str("def"));
        hset.add(new str("def"));
        hset.add(new str("stx"));

        Iterator<str> iter = hset.iterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }

        System.out.println("-------------------");

        aList.addAll(hset);
        Iterator<str> iter2 = aList.iterator();
        while(iter2.hasNext()) {
            System.out.println(iter2.next());
        }
    }
}
