package hello0704;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class mHashset2 {
    public static void main(String[] args) {
        TreeSet<Person> pSet = new TreeSet<Person>(new PersonComparator());

        pSet.add(new Person("John jones", 11));
        pSet.add(new Person("Sam Smith wang", 54));
        pSet.add(new Person("Connan Obraim", 25));
        pSet.add(new Person("Koo Ja Chul", 15));

        Iterator<Person> iter = pSet.iterator();

        while(iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
