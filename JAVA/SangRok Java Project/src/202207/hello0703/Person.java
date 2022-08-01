package hello0703;

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

    public int getAge() {
        return this.age;
    }

    @Override
    public int compareTo(Person other) {
        //return this.age - other.age 오름차순
        //return other.age - this.age 내림차순

        if(this.age > other.age){
            return 1;
        }
        else if(this.age < other.age){
            return -1;
        }
        else{ //같은 경우
            return 0;
        }
    }

    @Override
    public String toString(){
        return "Person{" + name + "," + age + "}";
    }


}
