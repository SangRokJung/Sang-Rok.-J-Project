package hello0704;

import java.util.Comparator;

// 정렬정보를 가지고 있는 Class
public class PersonComparator implements Comparator<Person> {

    public int compare(Person p1, Person p2){
        return p2.getName().length() - p1.getName().length();
    }
}
