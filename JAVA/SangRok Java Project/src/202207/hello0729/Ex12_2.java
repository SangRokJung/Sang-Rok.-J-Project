// package 202207.hello0729;

import java.util.*;

public class Ex12_2 {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<Student>();
        
        list.add(new Student("김연아", 1, 1));
        list.add(new Student("유재석", 1, 2));
        list.add(new Student("홍석천", 2, 1));

        // Iteraotr에 generics 적용
        Iterator<Student> it = list.iterator();

        while(it.hasNext()) {
            // generics를 적용 하지 않을 시 형변환을 해야한다.
            // Student s = (Student)it.next();
            // System.out.println(s.name);

            // 아래 코드처럼 코드가 간결해진다.
            System.out.println(it.next().name);
        }
    }
}

class Student{
    String name = "";
    int ban;
    int no;

    Student(String name, int ban, int no){
        this.name = name;
        this.ban = ban;
        this.no = no;
    }
}