package hello0703;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class mHashset2 {
    public static void main(String[] args) {
        TreeSet<Person> pSet = new TreeSet<Person>();

        pSet.add(new Person("John", 11));
        pSet.add(new Person("Sam", 54));
        pSet.add(new Person("chan", 25));
        pSet.add(new Person("Koo", 15));

        Iterator<Person> iter = pSet.iterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
