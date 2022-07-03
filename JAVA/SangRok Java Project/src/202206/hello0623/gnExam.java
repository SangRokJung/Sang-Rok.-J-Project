package hello0623;

import hello0623.generic.*;

public class gnExam {
    public static void main(String[] args) {

        box<apple> aB = new box<apple>();
        apple a = new apple();
        orange o = new orange();
        aB.set(a);


        dBox<String, Integer> dB  = new dBox<String, Integer>();
        dB.setBox("Melon", 10);
        String str = dB.getLeft();
        int in = dB.getRight();
        System.out.println(dB);
        System.out.println("box left : " + str);
        System.out.println("box right : " + in);




        dBox<String, String> dB2 = new dBox<String, String>();
        dB2.setBox("LLL", "RRR");
        System.out.println(dB2);




        dBox<String, String> dB3 = new dBox<>();
        dB2.setBox("Sugar", "Code");
        System.out.println(dB3);


        // 다목적 박스를 만들었기 때문에 
        // JC가 보장할 수 없는 강제 형변환이 발생하였다.
        // apple a1 = (apple)box.get();
        // System.out.println(a1);
    }
}
