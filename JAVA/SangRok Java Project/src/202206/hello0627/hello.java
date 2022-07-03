package hello0627;

import hello0622.box;

public class hello {
    public static void main(String[] args) {
        // 안돌아요.
        // Dbox Dbox = new Dbox();

        // same of two code, sugar code
        Dbox<String, Integer> box1 = new Dbox<String, Integer>();
        Dbox<String, Integer> box2 = new Dbox<>();
        // 이 뜻 입니다.
        // private String left;
        // private Integer right;


        
        // 박스안에 박스넣기
        Dbox<Dbox<String, Integer>, Dbox<String, Integer>> box3 = new Dbox<>();
        TBox<TBox, TBox> tBox = new TBox<TBox, TBox>();




        box1.setBox("Left", 10);
        System.out.println(box1);
    }
}
