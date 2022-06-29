package hello0629;

import java.util.List;
import java.util.LinkedList;

public class ExamCollection2 {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();


        // 리스트에 데이터를 입력한다.
        list.add("abc");
        list.add("kbs");
        list.add("JSR");


        // 리스트의 데이터를 읽는다.
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

        System.out.println("--------------------------------------------------------");

        // 리스트의 데이터를 지운다.
        list.remove(1);

        // 리스트의 데이터를 읽는다.
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

}
