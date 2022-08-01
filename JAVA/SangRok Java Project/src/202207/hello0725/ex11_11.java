package hello0725;

import java.util.*;


public class ex11_11 {
    public static void main(String[] args) {
        HashSet set = new HashSet();

        set.add("abc");
        set.add("abc");
        set.add(new Person("David", 10));
        set.add(new Person("David", 10));

        System.out.println(set);
    }
}

// equals(), hashCode()를 오버라이딩 해야 HashSet이 바르게 동작.
class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String toString() {
        return name + " : " + age;
    }

    @Override
    public int hashCode() {
        // int hash(Object... values) //가변인자
        return Objects.hash(name, age); //가변인자 => 변수를 더 넣어도 된다.
    }

    @Override
    public boolean equals(Object o) {
        if(!(o instanceof Person))
            return false;

        // 형변환 필요
        Person p = (Person)o;

        // this의 이름과 나이를 p로 비교.
        return this.name.equals(p.name) && this.age == (p.age);
    }
}