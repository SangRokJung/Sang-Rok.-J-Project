package hello0729;

import java.util.*;

public class Ex12_2_2 {
    public static void main(String[] args) {
        HashMap<String, Student> map = new HashMap<>();  //JDK 1.7부터 생성자에 타입지정 생성가능
        
        map.put("김연아" ,new Student("김연아", 1, 1, 100, 100, 100));
        map.put("유재석", new Student("유재석", 1, 2, 5, 5, 5));
    }
}

class Student{
    String name = "";
    int ban;
    int no;
    int kor;
    int eng;
    int math;

    Student(String name, int ban, int no, int kor, int eng, int math){
        this.name = name;
        this.ban = ban;
        this.no = no;
        this.kor = kor;
        this.eng = eng;
        this.math = math;
    }
}