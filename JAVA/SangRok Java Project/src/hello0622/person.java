package hello0622;

import java.util.Arrays;

public class person implements Comparable {
    private String name;
    private int age;

    public person(String name, int age) {
        this.name = name;
        this.age = age;
    }


    
    @Override
    public int compareTo(Object o) {
        person p = (person)o;

        if(this.age > p.age) 
            return 1;
        else if (this.age < p.age)
            return -1;
        else
            return 0;
    }
    
}
