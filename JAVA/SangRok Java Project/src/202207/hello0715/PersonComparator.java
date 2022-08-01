package hello0715;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {

    public int compare(Person p1, Person p2) {
        return p2.getName().length() - p1.getName().length();
    }
    
}
