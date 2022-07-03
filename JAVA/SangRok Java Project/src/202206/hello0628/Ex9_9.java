package hello0628;

import java.util.StringJoiner;

public class Ex9_9 {
    // join은 여러 문자열 사이에 구분자를 넣어서 결합한다.
    // split과 반대의 작업이다.

    public static void main(String[] args) {
        String animal = "dog, cat, bear";
        String[] arr = animal.split(", ");
        System.out.println(String.join("-", arr));



        StringJoiner sj = new StringJoiner("/","[","]");
        for(String s : arr){
            sj.add(s);
        }
        System.out.println(sj.toString());
    }
}
