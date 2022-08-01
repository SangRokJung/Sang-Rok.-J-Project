package hello0720;

import java.util.*;


public class arList {
    public static void main(String[] args) {
        // 기본길이(용량, capacity)가 10인 ArrayList를 생성
        // ArrayList에는 객체만 저장 가능.
        ArrayList list1 = new ArrayList(10);
        
        list1.add(new Integer(1));
        list1.add(new Integer(2));
        list1.add(new Integer(3));

        // autoBoxing에 의해 기본형이 참조형으로 자동 변환
        list1.add(4);
        list1.add(5);

        // ArrayList(Collection c)
        ArrayList list2 = new ArrayList(list1.subList(0, 4)); //0~3


        print(list1, list2);

        //오름 차순 정렬
        Collections.sort(list1);
        Collections.sort(list2);


        // list1에 list2의 모든 요소를 포함하고 있나?
        System.out.println("list1.containsAll(list2) = " + list1.containsAll(list2)); // true;


        // 추가할 위치를 설정
        // 중간위치에 추가하기 때문에 부담이 가는 작업.
        list2.add(3, "A");


        // 변경
        list2.set(3,"AA");


        // indexOf()는 지정된 객체의 위치를 알려준다.
        System.out.println("index = " + list2.indexOf("AA"));


        // 겹치는 부분만 남기고 삭제
        System.out.println("list1.retainAll(list2) = " + list1.retainAll(list2));
        print(list1, list2);


        // list2에서 list1에 포함된 객체들을 삭제.
        for(int i = list2.size() - 1; i >= 0; i--){ //끝의 인덱스부터 삭제
            if(list1.contains(list2.get(0)))
                list2.remove(i);
        }

        // 삭제
        list1.remove(0); // 인덱스가 0인걸 삭제
        list1.remove(new Integer(2)); //2를 삭제
        print(list1, list2);

    }

    static void print(ArrayList list1, ArrayList list2){
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
    }
}
