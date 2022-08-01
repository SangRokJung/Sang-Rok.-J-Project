package hello0715;

public class Person implements Comparable<Person> {
    private String name;
    private int age;

    Person(){
        this("none", 0);
    }
    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person[name : " + this.name + ", age : " + this.age + "]";
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if(obj == null)
            return false;
        if(getClass() != obj.getClass())
            return false;
        return (this.name == ((Person) obj).name) && (this.age == ((Person)obj).age);
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
        else{
            return 0;
        }
    }

}
