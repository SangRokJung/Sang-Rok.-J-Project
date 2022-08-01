package hello0729;

import java.util.*;

public class ex1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();   // Type Check가 강화됨
        
        // JDK1.5 부터 Generics가 도입된 이후 문법.
        ArrayList<Object> list2 = new ArrayList<Object>();  // 모든 Object 입력 가능

        list.add("string");
        //list.add(1);    // Compile Error

        String s = list.get(0); // 형변환 생략 가능
    }
}
