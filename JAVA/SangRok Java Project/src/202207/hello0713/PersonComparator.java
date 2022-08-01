package hello0713;

import java.util.Comparator;

public class PersonComparator implements Comparator<Person> {
    
    public int compare(Person a, Person b) {
        return b.getName().length() - a.getName().length();
    }
}
