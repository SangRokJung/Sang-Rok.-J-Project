package hello0704;

public class Person implements Comparable<Person> {
    // 단순한 정렬이 아닌 기준이 존재하는 정렬을 생성한다.

    private String name;
    private int age;


    Person(){
        this("none", 0);
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // getter
    public int getAge() {
        return this.age;
    }
    public String getName() {
        return this.name;
    }

    @Override
    public int compareTo(Person other) {
 
        // 이름의 글자수 기준, 오름차순
        if(this.name.length() > other.name.length()){
            return 1;
        }
        else if(this.name.length() < other.name.length()){
            return -1;
        }
        else{ //같은 경우
            return 0;
        }
    }

    @Override
    public String toString(){
        return "Person[name : " + name + ", age : " + age + "]";
    }


}
