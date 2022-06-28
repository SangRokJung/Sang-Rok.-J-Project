package hello0628;

public class Person {
    long id;

    public boolean equals(Object obj){
        if(obj instanceof Person){
            return id ==((Person)obj).id;
        }
        else{
            return false;
        }
    }

    public Person(long id) {
        this.id = id;
    }
}
