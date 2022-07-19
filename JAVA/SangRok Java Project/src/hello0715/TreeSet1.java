package hello0715;

import java.util.Comparator;
import java.util.Iterator;
import java.util.TreeSet;

public class TreeSet1 {
    public static void main(String[] args) {
        TreeSet<Person> pSet = new TreeSet<Person>(new PersonComparator());

        pSet.add(new Person("John", 11));
        pSet.add(new Person("Jake", 22));
        pSet.add(new Person("Micle", 43));
        pSet.add(new Person("harry", 81));

        Iterator<Person> iter = pSet.iterator();

        while(iter.hasNext()){
            System.out.println(iter.next());
        }

    }
}
