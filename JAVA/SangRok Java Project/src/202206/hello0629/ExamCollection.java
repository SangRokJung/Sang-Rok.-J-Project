package hello0629;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ExamCollection {
    public static void main(String[] args) {
        // Cellection Instance (컬렉션 클래스)의 생성.
        // ArrayList 배열은 기반으로 데이터를 유지한다.
        // 장점 : 참조는 빠르다, 읽기.
        // 단점 : 데이터의 구조가 변하는경우 처리가 느리다.
        // 메모리를 잡는게 메모리를 엑세스 하는것보다 몇 만배 느리다 ㅋ.
        // 처음부터 Capaacity를 잘 잡아야된다!
        // Capacity가 변경되는 순간 끝이다!
        // * 데이터의 변경이 없고 읽기가 많은 경우 사용한다.
        List<String> list = new ArrayList<>(15000);


        // 리스트에 데이터를 입력한다.
        list.add("abc");
        list.add("kbs");
        list.add("JSR");
        list.add("ZZZ");

        Iterator<String> iter = list.iterator();


        // 리스트의 데이터를 읽는다.
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }


        System.out.println("--------------------------------------------------------");

        // 리스트의 데이터를 지운다.
        list.remove(1);

        // 리스트의 데이터를 읽는다.
        // 다른 종류의 for문
        for (String s : list){
            System.out.println(s);
        }
    }

}
